package JavaPraticeProgram.CommandLineExample.DSA.Stack.StackUsingArray;

public class ImpStackUsingArray {
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(5);

        stackUsingArray.Display();

        stackUsingArray.Push(10);
        stackUsingArray.Push(20);
        stackUsingArray.Push(30);
        stackUsingArray.Display();

        stackUsingArray.Pop();
        stackUsingArray.Display();

        stackUsingArray.Peek();
        stackUsingArray.Display();
    }
}
