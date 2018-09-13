package com.sac;

public class Node {

    private int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }

    public void add(int data){
        Node node = new Node(data);
        Node head = this;
        while (head.next!= null){
            head = head.next;
        }
        head.next = node;
    }

    public Node delete(int data, Node head){

        Node tempHead = head;
        if(tempHead.data == data)
            return tempHead.next;
        while (tempHead.next != null){
            if(tempHead.next.data == data) {
                tempHead.next = tempHead.next.next;
                return head;
            }
            tempHead = tempHead.next;
        }
        return head;
    }

    public void display(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
