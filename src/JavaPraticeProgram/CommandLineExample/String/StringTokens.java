package JavaPraticeProgram.CommandLineExample.String;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
public class StringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();

        if(st.isEmpty()){
            System.out.println(0);
            return;
        }

        String[] token = st.split("[ !,?._'@]+");
        System.out.println(token.length);

        for(String tokens:token){
            System.out.println(tokens);
        }

    }
}