package dailyTask;

import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("enter grade : ");
            String grade = sc.next();
            switch (grade){
                case "O" : System.out.println("score between 95 - 100");
                break;
                case "A+" : System.out.println("score between 90 - 94");
                    break;
                case "A" : System.out.println("score between 85 - 89");
                    break;
                case "B" : System.out.println("score between 75 - 84");
                    break;
                case "C" : System.out.println("score between 60 - 74");
                    break;
                case "D" : System.out.println("score between 45 - 59");
                    break;
                case "F" : System.out.println("score between 0 - 44");
                    break;
                default: System.out.println("enter valid grade ");
                break;
            }
        }
    }

