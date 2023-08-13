package hashMap;

public class Node<K, V> {
    private Node<K, V> nextNode;
    private K key;
    private V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.nextNode = null;
    }

    public Node<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K, V> nextNode) {
        this.nextNode = nextNode;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}