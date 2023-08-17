package hashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<>();
        for (int i = 0; i < 1000000; i++) {
            myHashMap.put(i, i);
        }

        System.out.println("Size before removal: " + myHashMap.size());

        myHashMap.remove(100);
        myHashMap.remove(1000);
        myHashMap.remove(10000);

        System.out.println("Size after removal: " + myHashMap.size());

        System.out.println("Value at key 500: " + myHashMap.get(500));
        System.out.println("Value at key 1000: " + myHashMap.get(1000));
        System.out.println("Value at key 5000: " + myHashMap.get(5000));

        myHashMap.clear();
        System.out.println("Size after clear: " + myHashMap.size());
    }
}
