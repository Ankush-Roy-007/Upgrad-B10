import java.util.Scanner;
public class switchcase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Movie Genre code");
        int g = sc.nextInt();

        String moviename;
        switch (g){
            case 1:
                moviename = "Comedy Movies";
                break;
            case 2:
                moviename = "Action Movies";
                break;
            case 3:
                moviename = "Drama Movies";
                break;
            case 4:
                moviename = "3D Movies";
                break;
            default:
                moviename = "nothing";
                break;

        }
          System.out.println("Genre Name is:" + moviename);
    }
}
