package arrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

//        list.add(1);
//        list.add(5);

        for(int i = 0; i < 9; i++){
            list.add(i);
        }

//        System.out.println("list = " + list);
        System.out.println("Size = " + list.size());
        System.out.println("Get(0) = " + list.get(0));

        list.remove(3);
        System.out.println("Size after removal: " + list.size());

        list.clear();

        System.out.println("Size after clearing: " + list.size());

    }
}
