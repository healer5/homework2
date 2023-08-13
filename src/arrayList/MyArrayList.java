package arrayList;

//import java.util.Arrays;
//import java.util.StringJoiner;

public class MyArrayList {
    private static final int INIT_SIZE = 8;
    private Object[] data;
    private int index;

    public MyArrayList(){
        data = new Object[INIT_SIZE];
        index = 0;
    }

    public void add(int value){
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

    public void remove(int ind){
        if(ind < 0 || ind >= index){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for(int i = index; i < index - 1; i++){
            data[i] = data[i+1];
        }

        data[--index] = null;
    }

    public void clear(){
        for(int i = 0; i < index; i++){
            data[i] = null;
        }
        index = 0;
    }

    public int size(){
        return index;
    }

    public Object get(int i){
        return data[i];
    }

//    public String toString() {
//        StringJoiner result = new StringJoiner(", ");
//        for (int i = 0; i < index; i++){
//            result.add(Integer.toString(data[i]));
//        }
//
//        return "[" + result + "]";
//    }
}
