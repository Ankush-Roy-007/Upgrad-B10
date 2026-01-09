package production.upgradClass;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, -3, 7};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) { smallest = arr[i];
            }
            if (arr[i] > largest) { largest = arr[i];
            }
        } System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
