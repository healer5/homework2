package linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("from");
        myLinkedList.add("Ukraine");

        System.out.println("Element at index 1: " + myLinkedList.get(1));
        System.out.println("Size: " + myLinkedList.size());

        myLinkedList.remove(1);
        System.out.println("Size after removal: " + myLinkedList.size());

        myLinkedList.clear();
        System.out.println("Size after clearing: " + myLinkedList.size());
    }
}