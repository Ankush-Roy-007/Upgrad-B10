package JavaPraticeProgram.CommandLineExample.Pratice.Stack.UsingArray;

public class ImpStackUsingArray{
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);

        st.display();

        st.push(10);
        st.push(20);
        st.push(30);
        st.display();

        st.pop();
        st.display();

        st.peek();
    }
}
