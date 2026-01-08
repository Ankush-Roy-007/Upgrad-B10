public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Soham");
        System.out.println(personalised);
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


}
