import java.util.Scanner;
public class sortingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 43, 32, 55, 41, 11, 2, 99, 4, 3, 24, 54, 76};
//        int smallest = Integer.MAX_VALUE;
//        int largest = Integer.MIN_VALUE;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]< smallest){
//                smallest = arr[i];
//            }
//            if(arr[i]> largest){
//                largest = arr[i];
//            }
//        }
//        System.out.println("Smallest:"+smallest);
//        System.out.println("Largest:"+largest);
//    }
//}


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}