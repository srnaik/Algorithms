package com.sac;

public class LinkedListImpl {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.add(20);
        node.add(30);
        node.add(40);
        node.add(50);

        node.next.next.next = node.next;

        System.out.println(node.isLoopPresent(node));
    }
}
