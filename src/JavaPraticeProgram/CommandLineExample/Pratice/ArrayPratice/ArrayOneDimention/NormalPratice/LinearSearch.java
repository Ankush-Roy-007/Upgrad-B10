package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class LinearSearch {
    public static void main() {
        int[] arr = {5,4,7,9,1};
        int k = 9;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Element k:-"+arr[i]+" Found at Index:-"+i);
            }
        }
    }
}
