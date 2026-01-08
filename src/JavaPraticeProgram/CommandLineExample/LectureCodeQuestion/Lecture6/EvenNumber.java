package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture6;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rang = sc.nextInt();

        for (int i=1;i<=rang;i++ ){
            if(i %2==0){
                System.out.println(i);
            }if(i%5==0){
                break;
            }
        }


    }
}
