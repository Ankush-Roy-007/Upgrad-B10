package dailyTask;

import java.util.Scanner;

public class identifyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("negative");
        } else if (n>0) {
            System.out.println("positive");
        }else{
            System.out.println("zero");
        }
    }
}
