package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.TackUForward;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,7,5,7,2};
        int max = arr[0];
//        int secondMax = arr[0];
//
//        for(int i=0;i<arr.length;i++){
//
//            if (arr[i]>max){
//                max=arr[i];
//            } else if(arr[i]<max && arr[i]>secondMax) {
//                secondMax = arr[i];
//            }
//        }
//        System.out.println(secondMax);

        int secondMax = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]<max && arr[i] >secondMax) {
                secondMax = arr[i];
            }

        }
        System.out.println(secondMax);
    }
}
