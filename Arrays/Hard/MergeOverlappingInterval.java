package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingInterval {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6}, {8,9}, {9,11}, {8,10}, {2,4}, {15,18}, {16,17}};

        int[][] result = merge(nums);
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }

    public static int[][] brutemerge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        for(int i=0; i< intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!ans.isEmpty() && end <= ans.getLast()[1]) {
                continue;
            }

            for(int j=1; j< intervals.length; j++) {
                if(intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        return ans.toArray(new int[ans.size()][]);
    }


    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();

        for(int i=0; i< intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(ans.isEmpty() || start > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{start, end});
            }
            else {
                int last = ans.get(ans.size() - 1)[1];
                last = Math.max(last, end);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
