public class FunctionOverloading {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        add(10,20);  // calls 2-parameters method
        add(10,20,30);  // calls 3-parameters method
    }
}
