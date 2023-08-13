package hashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>(10);
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);

        System.out.println("Size: " + myHashMap.size());
        System.out.println("Get value for 'two': " + myHashMap.get("two"));

        myHashMap.remove("one");
        System.out.println("Size after remove: " + myHashMap.size());

        myHashMap.clear();
        System.out.println("Size after clear: " + myHashMap.size());
    }
}
