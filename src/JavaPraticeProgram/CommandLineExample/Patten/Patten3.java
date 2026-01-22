package JavaPraticeProgram.CommandLineExample.Patten;

public class Patten3 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++){
            for(int space=row ; space>=i;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
};
