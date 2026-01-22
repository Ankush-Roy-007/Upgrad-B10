package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture8;

public class Reverse {
    public void rev(int rev){
        int reverse = 0;
        while (rev > 0){
            int digit = rev % 10;
            reverse = reverse * 10 + digit;
            rev = rev / 10;
        }
        System.out.println(reverse);;
    }
}
