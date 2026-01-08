
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5};
        missingNumber(arr);
        xorMethod(arr);
    }

    public static void missingNumber(int[] arr) {
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i=0; i<arr.length; i++) {
            actualSum += arr[i];
        }

        System.out.println(expectedSum - actualSum);

    }


    public static void xorMethod(int[] arr) {
        int allXOR = 0;

        for(int i=0; i<=arr.length; i++) {
            allXOR = allXOR ^ i;
        }

        for(int num : arr) {
            allXOR = allXOR ^ num;
        }

        System.out.println(allXOR);
    }

}
