package JavaPraticeProgram.CommandLineExample.DSA.LinkedListUsingArray;

public class ImpLinkedlistUsingArray {
    public static void main(String[] args) {
        LinkedlistUsingArray linkedlistUsingArray = new LinkedlistUsingArray();

        int[] arr = {10,20,30};

        linkedlistUsingArray.createFromArray(arr);
        linkedlistUsingArray.Display();

        System.out.println("Add to first");

        linkedlistUsingArray.addFirst(0);
        linkedlistUsingArray.Display();

        System.out.println("Add to last");

        linkedlistUsingArray.addLast(40);
        linkedlistUsingArray.Display();

        System.out.println("Delete from first");

        linkedlistUsingArray.deleteFirst();
        linkedlistUsingArray.Display();

        System.out.println("Delete from last");

        linkedlistUsingArray.deleteLast();
        linkedlistUsingArray.Display();

    }
}
