package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class ArrayIsSortedOrNot {
    public static void main() {
        int[] arr = {1,2,3,4,5};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
