package com.sac;

public class Solution {


    public boolean isValidBST(Node node){
        return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    private boolean isValidBST(Node node, int low, int high){
        if(node == null)
            return true;

        return node.val > low && node.val < high
                && isValidBST(node.left,low, node.val)
                && isValidBST(node.right, node.val, high);
    }


    public static void main(String[] args) {

        Solution solution = new Solution();

        Node rootNode = new Node(20);
        rootNode.left = new Node(15);
        rootNode.left.left = new Node(14);
        rootNode.left.right = new Node(16);

        rootNode.right = new Node(24);
        rootNode.right.left = new Node(22);
        rootNode.right.right = new Node(26);

        boolean isBST = solution.isValidBST(rootNode);
        if(isBST)
            System.out.println("Given tree is a valid BST");
        else
            System.out.println("Given tree is not a valid BST");

    }
}
