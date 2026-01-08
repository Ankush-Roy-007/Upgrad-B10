public class SwapNumbers {
    public static void main(String[] args) {
        swap(2,3);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " & b = " + b);
    }
}
