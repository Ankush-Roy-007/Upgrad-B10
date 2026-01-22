package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class LargestElementInArray {
    public static void main() {
        int largestElement = Integer.MIN_VALUE;
        int[] arr = {2,6,7,1,3,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestElement){
                largestElement = arr[i];
            }
        }
        System.out.println(largestElement);
    }
}
