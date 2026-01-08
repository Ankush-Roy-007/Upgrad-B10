public class ArmstrongNumber {
    static void Armstrong(int num) {
        int original = num;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if(sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        Armstrong(153);
    }
}
