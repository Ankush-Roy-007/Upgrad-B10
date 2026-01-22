package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class SecondLargestElementInArray {
    public static void main() {
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        int[] arr = {2,6,7,1,3,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestElement){
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }else if(arr[i]>secondLargestElement && arr[i]!=largestElement){
                secondLargestElement = arr[i];
            }
        }
        System.out.println("Largest Element is:-"+largestElement);
        System.out.println("Second Largest Element is:-"+secondLargestElement);
    }
}
