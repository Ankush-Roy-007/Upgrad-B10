import java.util.Arrays;

public class VaraibleLengthArguments {
    static void add(int... nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        add(10);  // 10
        add(10, 20);  // 30
        add(10, 20, 30);  // 60

        fun(1,2,3,4,5);  // [1, 2, 3, 4, 5]
        fun(74, 36, 43, 16, 54, 26);  // [74, 36, 43, 16, 54, 26]
    }
}
