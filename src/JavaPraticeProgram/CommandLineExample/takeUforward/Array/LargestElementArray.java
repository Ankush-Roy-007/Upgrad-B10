package JavaPraticeProgram.CommandLineExample.takeUforward.Array;
//
public class LargestElementArray {
    public static void main(String[] args) {
//        int[] arr = {10,40,5,20,30};
//        int largest = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largest){
//                largest = arr[i];
//            }
//        }
//        System.out.println(largest);

        int[] arr = {10,20,50,30,60};
        int largest = 0;

        for(int i = 0; i<arr.length;i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is:- "+largest);
    }
}



