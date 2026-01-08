package com.soham;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Typecasting -
        int num1 = (int)(67.23f);
        System.out.println(num1);

        // Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);  // O/P: 1
//        // This is because the result is remainder between 257 and
//        // maximum value than can given to 'b' i.e. 256

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;

        System.out.println(d);

        int number = 'A';
        System.out.println(number);
    }
}
