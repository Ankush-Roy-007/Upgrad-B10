import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(true){
            if(i % 2 ==0) {
                System.out.println(i);
            }
            if(i % 5 ==0){
                break;
            }
            i++;
        }
    }
}
