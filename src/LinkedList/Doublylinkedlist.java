package LinkedList;

public class Doublylinkedlist {

    Node1 head;

    public Doublylinkedlist() {
        this.head = null;
    }

    // 🔹 Add at Beginning
    public void addFirst(int data) {
        Node1 newNode = new Node1(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // 🔹 Add at Last
    public void addLast(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // 🔹 Add in Middle (after given key)
    public void addMiddle(int key, int data) {
        Node1 temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Key not found");
            return;
        }

        Node1 newNode = new Node1(data);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    // 🔹 Traverse Forward
    public void traverseForward() {
        Node1 current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 🔹 Traverse Backward
    public void traverseBackward() {
        if (head == null) return;

        Node1 current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
