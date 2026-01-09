package dailyTask;

import java.util.Scanner;

public class filmCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter code : ");
        int c = sc.nextInt();
        switch (c){
            case 1:System.out.println("action");
            break;
            case 2:System.out.println("comedy");
            break;
            case 3:System.out.println("Drama");
            break;
            default: System.out.println("there is such a no code like this "+ c);
        }
    }
}
