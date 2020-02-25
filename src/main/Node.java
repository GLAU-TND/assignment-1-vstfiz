package main;

public class Node {
    private Person data;
    private Node next;
    private int index;

    public Node(int index,Person data){
        this.index = index;
        this.data = data;
        next = null;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}