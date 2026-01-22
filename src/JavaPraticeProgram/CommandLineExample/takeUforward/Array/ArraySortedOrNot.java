package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1 , 4 , 3 , 4 , 5};
//        boolean isSorted = true;
//        for(int i = 0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("Array is sorted");
//        }else{
//            System.out.println("Not sorted");
//        }

        boolean isSorted = true;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }

        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Not sorted");
        }


    }
}
