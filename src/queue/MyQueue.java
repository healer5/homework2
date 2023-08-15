package queue;

import arrayList.MyArrayList;

public class MyQueue<T> {
    private MyArrayList<T> list;

    public MyQueue() {
        list = new MyArrayList<>();
    }

    public void add(T value) {
        list.add(value);
    }

    public void clear() {
        list.clear();
    }

    public int size() {
        return list.size();
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public T poll() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = list.get(0);
        list.remove(0);
        return data;
    }
}