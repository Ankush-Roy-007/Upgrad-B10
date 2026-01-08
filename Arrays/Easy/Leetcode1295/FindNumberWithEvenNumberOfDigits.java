package Leetcode1295;

public class FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;

        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Function to check if number contains even number of digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }


//    static int digits(int num) {
//        return (int)(Math.log10(num)) + 1;
//    }
}
