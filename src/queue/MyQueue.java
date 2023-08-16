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
    private void checkNotEmpty() {
        if (list.size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public T peek() {
        checkNotEmpty();
        return list.get(list.size() - 1);
    }

    public T poll() {
        checkNotEmpty();
        T data = list.get(0);
        list.remove(0);
        return data;
    }
}