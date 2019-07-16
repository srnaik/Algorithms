package com.sac;

public class LinkedList {

    Node head;

    public void append(int data){

        if(head == null) {
            head = new Node(data);
            return;
        }

        Node tempHead = head;
        while(tempHead.next != null){
            tempHead = tempHead.next;
        }
        tempHead.next = new Node(data);
    }


    public void prepend(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void deleteWithData(int data){

        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null){

            if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }
}
