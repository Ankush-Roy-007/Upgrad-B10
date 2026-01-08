package JavaPraticeProgram.CommandLineExample.Pratice.Stack.UsingLinkedlist;

public class Imp {
    public static void main(String[] args) {
        StackUsingLinkedlist st = new StackUsingLinkedlist();

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
