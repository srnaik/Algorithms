package com.sac;

public class DoublyLinkedList {

    private final int size;
    private int currSize;
    private Node head, tail;

    public DoublyLinkedList(int size){
        this.size = size;
    }

    public Node addToList(int pageNumber){
        Node pageNode = new Node(pageNumber);
        if(head == null){
            head = pageNode;
            tail = pageNode;
            currSize = 1;
            return pageNode;
        }else if (currSize < size){
            currSize++;
        }else{
            tail = tail.getPrev();
            tail.setNext(null);
        }
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;
        return head;
    }

    public void movePageToHead(Node pageNode){
        if(pageNode == null || pageNode == head)
            return;

        if(pageNode == tail){
            tail = tail.getPrev();
            tail.setNext(null);
        }

        Node prev = pageNode.getPrev();
        Node next = pageNode.getNext();
        prev.setNext(next);

        if(next != null){
            next.setPrev(prev);
        }

        pageNode.setPrev(null);
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head = pageNode;
    }

    public int getSize() {
        return size;
    }

    public int getCurrSize() {
        return currSize;
    }

    public void setCurrSize(int currSize) {
        this.currSize = currSize;
    }

    public void printList(){
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.getPageNumber() + " ");
            System.out.println();
            tmp = tmp.getNext();
        }
    }
}
