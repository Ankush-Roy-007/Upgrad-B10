import java.util.Scanner;

public class PrimeNumber {
    static void isPrime(int num) {
        if(num <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        isPrime(17);
    }
}
