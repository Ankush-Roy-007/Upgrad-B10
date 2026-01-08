package Stack;
public class Main {
    public static void main(String[] args) {
        Stackarray stackarray = new Stackarray(5);

        stackarray.Display();

        stackarray.Push(10);
        stackarray.Push(20);
        stackarray.Push(30);
        stackarray.Display();

        stackarray.Pop();
        stackarray.Display();

        stackarray.Peek();
        stackarray.Display();
    }
}