package JavaPraticeProgram.CommandLineExample.Lecture6;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        for (int i = n ; i <=a+10 ;i++ ){
            int sum = i * 11;
            System.out.println(sum);
        }
    }
}
