package linkedList.auto;
import java.util.LinkedList;

public class DLlist {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(6);
        ll.add(7);
        for(Object i: ll){
            System.out.print(i);
        }
        ll.add(3,4);
        System.out.println("\nadd elemnt");
        for(Object i: ll){
            System.out.print(i);
        }
        System.out.println("\nadd elemnt");
        System.out.println(ll.reversed());

        for(Object i: ll){
            System.out.print(i);
        }

    }
}
