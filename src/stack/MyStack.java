package stack;

import arrayList.MyArrayList;

public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T value) {
        list.add(value);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return data;
    }
}