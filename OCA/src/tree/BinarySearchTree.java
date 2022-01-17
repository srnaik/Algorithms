package tree;

import java.util.Collection;
import java.util.Collections;

public class BinarySearchTree {

    private Node rootNode;

    public BinarySearchTree(){
        rootNode = null;
    }

    public void insert(int key){
        rootNode  = insert(rootNode,key);
    }

    private Node insert(Node rootNode, int key){

        if(rootNode == null){
            rootNode = new Node(key);
            return rootNode;
        }
        if(rootNode.key > key){
            rootNode.leftNode = insert(rootNode.leftNode,key);
        }else if(rootNode.key < key){
            rootNode.rightNode =  insert(rootNode.rightNode,key);
        }
        return rootNode;

    }

    public Node search(int key){
        return search(rootNode,key);
    }

    private Node search(Node rootNode, int key){
        if(rootNode == null || rootNode.key == key)
            return rootNode;
         if(rootNode.key < key)
             return search(rootNode.leftNode,key);
         else
             return search(rootNode.rightNode,key);
    }


    public void display(){
        display(rootNode);
    }

    private void display(Node rootNode){

        if(rootNode != null){
            display(rootNode.leftNode);
            System.out.println(rootNode.key);
            display(rootNode.rightNode);
        }

    }

    public void delete(int key){
        rootNode = delete(rootNode,key);
    }

    private Node delete(Node rootNode, int key){

        if(rootNode == null)
            return rootNode;

        if(rootNode.key > key)
            rootNode.leftNode = delete(rootNode.leftNode,key);
        else if(rootNode.key < key)
            rootNode.rightNode = delete(rootNode.rightNode,key);
        else{
            if(rootNode.rightNode == null)
                return rootNode.leftNode;
           else if(rootNode.leftNode == null)
                return rootNode.rightNode;
            rootNode.key = minValue(rootNode.rightNode);
            rootNode.rightNode = delete(rootNode.rightNode,rootNode.key);

        }
        return null;
    }

    private int minValue(Node node){
        int minValue = node.key;
        while (node.leftNode != null){
            minValue = node.key;
            node = node.leftNode;
        }
        return minValue;
    }

}
