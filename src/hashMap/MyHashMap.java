package hashMap;

import indexUtil.IndexUtils;

public class MyHashMap<K, V> {
    private Node<K, V>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new Node[capacity];
    }

    private int hash(K key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (key == null) {
            return;
        }

        Node<K, V> newNode = new Node<>(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node<K, V> current = buckets[index];
            while (current.getNextNode() != null) {
                if (current.getKey().equals(key)) {
                    current.setValue(value);
                    return;
                }
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
        size++;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.getKey().equals(key)) {

                IndexUtils.validateIndex(index, buckets.length);

                buckets[index] = current.getNextNode();
                size--;
                return;
            }
            current = current.getNextNode();
        }
    }

    public void clear() {
        buckets = new Node[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = hash(key);

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