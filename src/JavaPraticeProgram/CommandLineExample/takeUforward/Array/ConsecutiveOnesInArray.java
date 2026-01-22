package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class ConsecutiveOnesInArray {
    public static void main(String[] args) {
//        int[] arr = {1,1,0,1,1,1,0,1,1,1,1,0};
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int MaxConsecutiveOnes = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                MaxConsecutiveOnes = Math.max(MaxConsecutiveOnes, count);
            } else{
//                if(MaxConsecutiveOnes < count){
//                    MaxConsecutiveOnes = count;
                    count = 0;
//                }

            }
        }
        System.out.println("Count of max ConsecutiveOnes in array is :-"+MaxConsecutiveOnes);
    }
}
