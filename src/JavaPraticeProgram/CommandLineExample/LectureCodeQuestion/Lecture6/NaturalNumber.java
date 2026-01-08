package JavaPraticeProgram.CommandLineExample.Lecture6;

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
//        int n = 10;
//        for(int i=1;i<=n;i++ ){
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num =1;
//        while(true){
//            System.out.println(a);
//            a +=1;
//
//            if(num >=10){
//                break;
//            }
//            num++;
//        }
        do {
            System.out.println(a);
            a+=1;
            num++;

        }while (num <=10);


    }
}
