package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture9;

public class GreterNumberTwo {
    public void greater(int a , int b ){
        if (a>b){
            System.out.println("A is greater");
        }else {
            System.out.println("B is greater");
        }
    }

    public void greater(int a , int b , int c ){
        if (a>b && a>c){
            System.out.println("A is greater");
        }else if( b>c) {
            System.out.println("B is greater");
        }else {
            System.out.println("C is greater");
        }
    }
}
