package linkedList;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public void add(T val){
        if(firstNode == null){
            firstNode = new Node<>(null, null, val);
        } else if(lastNode == null){
            lastNode = new Node<>(firstNode, null, val);
            firstNode.setNextNode(lastNode);
        }else {
            Node<T> node = new Node<>(lastNode, null,val);
            lastNode.setNextNode(node);
            lastNode = node;
        }
        size++;
    }


    public T get(int index){
        Node<T> currentNode = firstNode;
        if(index == 0){
            return currentNode.getValue();
        }
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> nodeToRemove = getNodeAtIndex(index);

        if(nodeToRemove.getPrevNode() == null){
            firstNode = nodeToRemove.getNextNode();
        } else {
            nodeToRemove.getPrevNode().setNextNode(nodeToRemove.getNextNode());
        }

        if(nodeToRemove.getNextNode() == null){
            lastNode = nodeToRemove.getPrevNode();
        } else {
            nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
        }

        size--;
    }

    public void clear(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }
    public int size() {
        return size;
    }

    private Node<T> getNodeAtIndex(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }
}