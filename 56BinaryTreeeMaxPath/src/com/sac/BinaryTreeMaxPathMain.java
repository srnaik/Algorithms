package com.sac;

public class BinaryTreeMaxPathMain {

    public static void main(String[] args) {
        BinaryTreeMaxPath treeMaxPath = new BinaryTreeMaxPath();
        TreeNode treeNode = new TreeNode(1);
        treeNode.leftNode = new TreeNode(2);
        treeNode.rightNode = new TreeNode(4);
        treeNode.leftNode.leftNode = new TreeNode(2);
        treeNode.leftNode.rightNode = new TreeNode(3);

        int maxPath = treeMaxPath.maxPath(treeNode);
        System.out.println("Max Path value is: " + maxPath);
    }
}
