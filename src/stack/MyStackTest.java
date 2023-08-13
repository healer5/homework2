package stack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Size after pop: " + myStack.size());

        myStack.remove(0);
        System.out.println("Size after remove: " + myStack.size());

        myStack.clear();
        System.out.println("Size after clear: " + myStack.size());
    }
}
