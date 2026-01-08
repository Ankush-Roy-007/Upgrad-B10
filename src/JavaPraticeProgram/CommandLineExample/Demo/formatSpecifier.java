package JavaPraticeProgram.CommandLineExample.Demo;

public class formatSpecifier {
    public static void main(String[] args) {
//        float a = 3.5f;
//        System.out.printf("%.4f",a);
        int a=5;
        String b = "java";
        String c = " ";

        System.out.printf("%15s%15s%03d",b,c,a);
    }
}
