package OparaterBasic;

import java.util.Scanner;

public class Andopearter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>10 && a<50){
            System.out.println("Number is greater than 10 or less than 50");
        }else {
            System.out.println("Number is less than 10 or greater");
        }
    }
}
