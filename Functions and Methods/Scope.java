public class Scope {
    public static void main(String[] args) {
//        System.out.println(num);   // error
//        System.out.println(marks);   // error
    }

    static void functional(int marks) {
        int num = 40;
        System.out.println(num);
        System.out.println(marks);
    }

    static void block() {
        {
            int a = 70;
            System.out.println(a);  // 70
        }
//        System.out.println(a);  // error
    }


    static void loop() {
        int x = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            x = 100;
        }
        System.out.println(x);  // 100
//        System.out.println(i);  // error
    }
}
