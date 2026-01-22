package JavaPraticeProgram.CommandLineExample.Pratice.ArrayPratice.ArrayOneDimention.NormalPratice;

public class FindMissingNumberInArray {
    static void main() {


        int[] arr = {1, 2, 3, 5};
        int n = 5;
        int sum = (n * (n + 1)) / 2;
        int missingNumber = 0;
        int arraySum = 0;

        for (int i = 0; i < arr.length;i++){
            arraySum+=arr[i];
        }
        if(arraySum!=sum){
            missingNumber = sum - arraySum;
        }
        System.out.println("Missing Number is:-"+missingNumber);
    }
}
