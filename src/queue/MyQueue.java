package queue;

public class MyQueue<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(null, null, value);
        if (lastNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
            newNode.setPrevNode(lastNode);
            lastNode = newNode;
        }
        size++;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (firstNode == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return firstNode.getValue();
    }

    public T poll() {
        if (firstNode == null) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = firstNode.getValue();
        firstNode = firstNode.getNextNode();
        if (firstNode == null) {
            lastNode = null;
        } else {
            firstNode.setPrevNode(null);
        }
        size--;
        return data;
    }
}
