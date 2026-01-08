package JavaPraticeProgram.CommandLineExample.Lecture8;

public class Main {
    public static void main(String[] args) {
        Reverse re = new Reverse();
        re.rev(123);
        System.out.println(re);

        Addition ad = new Addition();
        ad.add(15,6);

        StaticMethod.Hello();
        Non_Static_Method non_static_method = new Non_Static_Method();
        non_static_method.Hello();

    }
}
