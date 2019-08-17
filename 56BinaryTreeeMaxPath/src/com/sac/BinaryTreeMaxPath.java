package com.sac;

public class BinaryTreeMaxPath {

    int maxSum = 0;

    public int maxPath(TreeNode treeNode){
        maxSum = Integer.MIN_VALUE;
        findMax(treeNode);
        return maxSum;
    }

    private int findMax(TreeNode treeNode){
        if(treeNode == null)
            return 0;

        int left = findMax(treeNode.leftNode);
        int right = findMax(treeNode.rightNode);
        maxSum = Math.max(treeNode.val + left + right, maxSum);
        int rel = treeNode.val + Math.max(left,right);
        return  rel > 0 ? rel : 0;
    }
}
