import java.util.Scanner;
public class gradeswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The test Score:");
        int t = sc.nextInt();

        String grade;
        switch (t/10){
            case 10:
                grade = "A";
                break;
            case 9:
                grade = "B";
                break;
            case 8:
                grade = "C";
                break;
            case 7:
                grade = "D";
                break;
             default:
                 grade = "Fail";
                 break;
        }
          System.out.println("Your Test Score Is:" + grade);


    }
}
