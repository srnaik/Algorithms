package rope;

import java.util.Arrays;

public class BinarySearch {

    private Node root;

    public BinarySearch(){
        root = null;
    }

    public void insert(int data){
        root = insert(root,data);
    }

    private Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data)
            root.leftNode = insert(root.leftNode,data);
        else if(data > root.data)
            root.rightNode = insert(root.rightNode,data);
       // Arrays.binarySearch()
        return root;
    }

    public void display(){
        display(root);
    }

    private void display(Node root){
        if (root == null)
            return;
        if (root != null){
            display(root.leftNode);
            System.out.println(root.data);
            display(root.rightNode);
        }
    }

    public Node search(int data){
        return search(root,data);
    }

    private Node search(Node root, int data){
        if(root == null || root.data == data)
            return root;
        if(data < root.data)
            return search(root.leftNode,data);
        else
            return search(root.rightNode,data);
    }

    public void delete(int data){
        root = delete(root,data);
    }

    private Node delete(Node root, int data){

        if(root == null)
            return root;
        if(data < root.data)
            //if data is less than root value, traverse towards left side of the tree.
            root.leftNode = delete(root.leftNode,data);
        else if (data > root.data)
            //If data is greater than root value, traverse towards right side of the tree.
            root.rightNode = delete(root.rightNode,data);
        else{
            //Node to be deleted is found.
            if(root.rightNode == null)
                return root.leftNode;
            else if(root.leftNode == null)
                return root.rightNode;
            //If the node has both left and right children, find the min of right child.
            root.data = minValue(root.rightNode);
            //Delete the min of right child
            root.rightNode = delete(root.rightNode,root.data);
        }

        return root;
    }


    public int minValue(Node root){
        int minValue = root.data;
        while (root.leftNode != null){
            minValue = root.leftNode.data;
            root = root.leftNode;
        }
        return minValue;
    }

    public Node getRoot() {
        return root;
    }
}
