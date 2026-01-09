package dailyTask;

import java.util.Scanner;

public class outFormatting {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("================================");
                for(int i=0;i<3;i++){
                    String s1=sc.next();
                    float x=sc.nextFloat();
                    System.out.printf("%-15s%.3f%n",s1,x);
                }
                System.out.println("================================");
    }
}
