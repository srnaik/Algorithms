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

    private int maxDepth(Node rootNode){

        if(rootNode == null)
            return 0;
        if(rootNode.right == null)
            return maxDepth(rootNode.left)+1;
        if(rootNode.left == null)
            return maxDepth(rootNode.right)+1;
        return Integer.max(maxDepth(rootNode.left),maxDepth(rootNode.right))+1;
    }

    private int minDepth(Node rootNode){

        if(rootNode == null)
            return 0;
        if(rootNode.right == null)
            return maxDepth(rootNode.left)+1;
        if(rootNode.left == null)
            return maxDepth(rootNode.right)+1;
        return Integer.min(maxDepth(rootNode.left),maxDepth(rootNode.right))+1;
    }

    public boolean isBalanced(Node rootNode){
        return treeDepth(rootNode) != -1;
    }

    private int treeDepth(Node rootNode){

        if(rootNode == null)
            return 0;
        int left = treeDepth(rootNode.left);
        if(left == -1)
            return -1;
        int right = treeDepth(rootNode.right);
        if(right == -1)
            return -1;
        return (Math.abs(left-right) <= 1) ? (Math.max(left,right) + 1) : -1;
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
        rootNode.right.right.right = new Node(28);
        rootNode.right.right.left = new Node(25);
    ;

        boolean isBST = solution.isValidBST(rootNode);
        if(isBST)
            System.out.println("Given tree is a valid BST");
        else
            System.out.println("Given tree is not a valid BST");

        int maxDepth = solution.maxDepth(rootNode);
        System.out.println("Maximum Depth: "+ maxDepth);

        int minDepth = solution.minDepth(rootNode);
        System.out.println("Minimum Depth: "+ minDepth);

        boolean isBalanced = solution.isBalanced(rootNode);
        if(isBalanced)
            System.out.println("Give Tree is a Balanced Tree");
        else
            System.out.println("Given Tree is not a Balanced Tree");


    }
}
