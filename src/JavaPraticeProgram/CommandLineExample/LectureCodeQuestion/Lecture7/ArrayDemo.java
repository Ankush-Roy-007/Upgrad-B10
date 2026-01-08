package JavaPraticeProgram.CommandLineExample.Lecture7;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        int[] number1 = {1,2,3,4,5};
        System.out.println(number == number1);
        System.out.println(number.equals(number1));
    }
}
