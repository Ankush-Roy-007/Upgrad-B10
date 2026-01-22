package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture6;

import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str.substring(0,2).toLowerCase() + str.substring(2,5).toUpperCase()+str.substring(4,6).toLowerCase());
        System.out.println("Check the length of String"+str.length());
        System.out.println("Check the character at given index"+str.charAt(1));
        System.out.println("If given character or string present or not"+str.contains("an"));
        System.out.println("Replace perticular character with other character"+str.replace("a" ,"b"));
    }
}
