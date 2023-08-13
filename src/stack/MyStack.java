package stack;

public class MyStack<T> {
    private Object[] array;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        array = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T value) {
        if (top == array.length - 1) {
            resizeArray();
        }
        array[++top] = value;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < top; i++) {
            array[i] = array[i + 1];
        }
        top--;
    }

    public void clear() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public T peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) array[top];
    }

    public T pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = (T) array[top];
        array[top--] = null;
        return data;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }


}


