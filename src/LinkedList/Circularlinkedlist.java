package LinkedList;

public class Circularlinkedlist {

    Node2 head;

    public Circularlinkedlist() {
        head = null;
    }

    // 🔹 Add at Beginning
    public void addFirst(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 tail = head.prev;

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;
    }

    // 🔹 Add at Last
    public void addLast(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node2 tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;

        newNode.next = head;
        head.prev = newNode;
    }

    // 🔹 Add in Middle (after key)
    public void addMiddle(int key, int data) {
        if (head == null) return;

        Node2 temp = head;

        do {
            if (temp.data == key) {
                Node2 newNode = new Node2(data);

                newNode.next = temp.next;
                newNode.prev = temp;

                temp.next.prev = newNode;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Key not found");
    }

    // 🔹 Traverse Forward
    public void traverseForward() {
        if (head == null) return;

        Node2 temp = head;
        System.out.print("Forward: ");

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // 🔹 Traverse Backward
    public void traverseBackward() {
        if (head == null) return;

        Node2 temp = head.prev;
        System.out.print("Backward: ");

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != head.prev);

        System.out.println("(back to tail)");
    }
}
