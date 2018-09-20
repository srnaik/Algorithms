package com.sac;

public class ValidateBinarySearch {

    public boolean isBinaryTree(Node node){
        return isBinaryTree(node, null, null);
    }

    private boolean isBinaryTree(Node node, Integer low, Integer high){
        if(node == null)
            return true;
        return (low == null || node.data > low) && (high == null || node.data < high)
                && isBinaryTree(node.leftNode , low, node.data)
                && isBinaryTree(node.rightNode, node.data, high);
    }
}
