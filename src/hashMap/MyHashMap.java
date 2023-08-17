package hashMap;

public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;
    private static final int CAPACITY = 16;
    private int size;
    private int index;


    public MyHashMap() {
        buckets = new Node[CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        index = Math.abs(key.hashCode() % buckets.length);

        if (buckets[index] == null) {
            buckets[index] = newNode;
            size++;
        } else {
            Node<K, V> currentNode = buckets[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    return;
                }
                if (currentNode.getNextNode() == null) {
                    currentNode.setNextNode(newNode);
                    size++;
                    if (size > buckets.length * 0.75) {
                        resizeBuckets();
                    }
                    return;
                }
                currentNode = currentNode.getNextNode();
            }
        }
    }

    private void resizeBuckets() {
        Node<K, V>[] oldBuckets = buckets;
        int newCapacity = buckets.length * 2;
        buckets = new Node[newCapacity];
        size = 0;

        for (Node<K, V> node : oldBuckets) {
            while (node != null) {
                put(node.getKey(), node.getValue());
                node = node.getNextNode();
            }
        }
    }


    public void remove(K key) {
        index = Math.abs(key.hashCode() % buckets.length);

        Node<K, V> currentNode = buckets[index];
        Node<K, V> prevNode = null;

        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                if (prevNode == null) {
                    buckets[index] = currentNode.getNextNode();
                } else {
                    currentNode = currentNode.getNextNode();
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    public void clear() {
        buckets = new Node[CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        index = Math.abs(key.hashCode() % buckets.length);

        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNextNode();
        }
        return null;
    }
}
