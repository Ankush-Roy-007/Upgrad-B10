package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Circular1 {
    public static void main(String[] args) {

        LinkedList<Integer> cll = new LinkedList();

        // Add at beginning
        cll.addFirst(10);

        // Add at last
        cll.addLast(30);

        // Add in middle (index-based)
        cll.add(1, 20);

        // 🔹 Forward Circular Traversal
        System.out.print("Forward Circular: ");
        int count = 0;
        int size = cll.size();
        ListIterator<Integer> it = cll.listIterator();

        while (count < size) {
            if (!it.hasNext()) {
                it = cll.listIterator(); // move back to head (circular)
            }
            System.out.print(it.next() + " ");
            count++;
        }

        // 🔹 Backward Circular Traversal
        System.out.print("\nBackward Circular: ");
        count = 0;
        it = cll.listIterator(cll.size());

        while (count < size) {
            if (!it.hasPrevious()) {
                it = cll.listIterator(cll.size()); // move to tail
            }
            System.out.print(it.previous() + " ");
            count++;
        }
    }
}
