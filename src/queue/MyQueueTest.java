package queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println("Size: " + myQueue.size());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Poll: " + myQueue.poll());
        System.out.println("Size after poll: " + myQueue.size());

        myQueue.clear();
        System.out.println("Size after clear: " + myQueue.size());
    }
}
