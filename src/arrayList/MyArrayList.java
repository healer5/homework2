package arrayList;

import indexUtil.IndexUtils;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;
    private Object[] data;
    private int index;

    public MyArrayList(){
        data = new Object[INIT_SIZE];
        index = 0;
    }

    public void add(T value){
        resizeIfNeed();
        data[index] = value;
        index++;
    }

    private void resizeIfNeed(){
        if(index == data.length - 1){
            int newSize = data.length*2;

            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0,newData, 0, data.length);
            data = newData;
        }
    }

    public void remove(int ind) {
        IndexUtils.validateIndex(ind, index);

        for (int i = ind; i < index - 1; i++) {
            data[i] = data[i + 1];
        }

        data[--index] = null;
    }

    public void clear(){
        data = new Object[INIT_SIZE];
        index = 0;
    }

    public int size(){
        return index;
    }

    public T get(int i){
        return (T) data[i];
    }

}
