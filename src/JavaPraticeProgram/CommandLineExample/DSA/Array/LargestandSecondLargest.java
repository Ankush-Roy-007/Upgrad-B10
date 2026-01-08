package JavaPraticeProgram.CommandLineExample.DSA.Array;

public class LargestandSecondLargest {
    public static void main(String[] args) {

        int []arr = {4 , 80 ,40 ,90 ,70};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(second);

    }
}
