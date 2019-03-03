package com.sac;

public class Node {

    int data;
    Node leftNode;
    Node rightNode;
    boolean isVisited;


    Node(int data){
        this.data = data;
        leftNode = rightNode = null;
        isVisited = false;
    }

}
