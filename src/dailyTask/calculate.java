package dailyTask;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter opearation");
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. mul");
        System.out.println("4. div");
        int op = sc.nextInt();
        switch (op){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            default:System.out.println("to complcate to slove");
            break;
        }

    }
}
