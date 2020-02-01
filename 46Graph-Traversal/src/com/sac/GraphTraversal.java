package com.sac;

public class GraphTraversal {

    public static void main(String[] args) {

        //The tree:
        //   1
        //  / \
        // 7   9
        // \  / \
        //  8 2 3

        Node node1 = new Node(1);
        Node node7 = new Node(7);
        Node node9 = new Node(9);
        Node node8 = new Node(8);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.leftNode = node7;
        node1.rightNode = node9;
        node7.rightNode = node8;
        node9.rightNode = node3;
        node9.leftNode = node2;
        System.out.println("DFS: ");
        Graph.depthFirstSearch(node1);
        System.out.println("\nBFS: ");
        Graph.breadthFirstSearch(node1);

    }
}
