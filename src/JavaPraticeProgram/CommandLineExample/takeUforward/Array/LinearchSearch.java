package JavaPraticeProgram.CommandLineExample.takeUforward.Array;

public class LinearchSearch {
    public static void main(String[] args) {
        int[] arr = {1,5,4,7,9};
        int[] arr1 = {4,4,5,6};
        int num = 7;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Element present at index:-"+i);
            }else {
                System.out.println("Element not present in array");
            }
        }


    }
}
