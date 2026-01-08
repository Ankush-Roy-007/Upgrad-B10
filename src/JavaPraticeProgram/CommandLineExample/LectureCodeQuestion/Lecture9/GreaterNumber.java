package JavaPraticeProgram.CommandLineExample.Lecture9;

public class GreaterNumber {

    public void GreaterOfTwoNumber(int a , int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else {
            System.out.println(b+" is greater than "+a);
        }
    }

    public void GreaterOfThreeNumber(int a , int b , int c){
        if(a>b && a>c){
            System.out.println(a+" is greater than "+b+" and  "+c);
        } else if (b>c) {
            System.out.println(b+" is greater than "+a+" and "+c);
        }else {
            System.out.println(c+" is greater than "+a+" and "+b);
        }

    }
}
