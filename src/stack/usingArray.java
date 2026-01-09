package stack;

public class usingArray {
    public static void main(String[] args) {
        ArrayIMP AI = new ArrayIMP(10);
        AI.push(1);
        AI.push(2);
        AI.push(3);
        AI.push(4);
        AI.push(5);
        AI.push(6);
        AI.push(7);
        AI.push(8);
        AI.push(9);
        AI.push(10);
        AI.push(11);
        System.out.println(AI.isFull());
        AI.pop();

        AI.peek();

        System.out.println(AI.isEmpty());

        AI.size();
    }
}
