package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,5};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }

        if(isSorted==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is notSorted");
        }
    }
}
