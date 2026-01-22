package JavaPraticeProgram.CommandLineExample.Demo;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Initial speed");
        int u = sc.nextInt();
        System.out.println("Enter the Initial time");
        int t = sc.nextInt();
        System.out.println("Enter the acceleration");
        int a = sc.nextInt();
//        System.out.println("Enter next time ");
//        int t2 = sc.nextInt();

        double distance = (u*t) + (1*a*t*t)/2;
        System.out.println("Distance is "+distance+"km");

        // s = ut + 1/2(a*t^2)




    }
}
