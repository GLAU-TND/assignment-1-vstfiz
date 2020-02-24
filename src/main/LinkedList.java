package main;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    //insert at last
    public void insert(int index,Person data){
        Node node = new Node(index,data);

        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public void sort() {
        Node temp;
        Node tempNext = null;
        boolean swapping;
        do {
            swapping = false;
            temp = this.head;
            while (temp.getNext() != tempNext) {
                if (temp.getData().getfirstName().compareToIgnoreCase(temp.getNext().getData().getfirstName()) > 0) {
                    swap(temp, temp.getNext());
                    swapping = true;
                }
                temp = temp.getNext();
            }
            tempNext = temp;
        }
        while (swapping);
    }

    void swap(Node p1,Node p2){
        Person p = p1.getData();
        p1.setData(p2.getData());
        p2.setData(p);
    }
}
