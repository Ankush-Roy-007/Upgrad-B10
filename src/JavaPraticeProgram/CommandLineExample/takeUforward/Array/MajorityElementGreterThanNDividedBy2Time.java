package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class MajorityElementGreterThanNDividedBy2Time {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
//        for(int i=0;i<arr.length;i++){
//            int count = 0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count > arr.length/2){
//                System.out.println(arr[i]);
//                break;
//            }
//
//        }

        int count = 0;
        int candidate = 0;

        for(int num:arr){
            if(count == 0){
                candidate = num;
            }
            if(candidate == num){
                count++;
            }else {
                count--;
            }
        }
        count =0;
        for (int num:arr){
            if(candidate == num){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("Majority element is"+candidate);
        }else{
            System.out.println("No Majority element is present");
        }

    }

}
