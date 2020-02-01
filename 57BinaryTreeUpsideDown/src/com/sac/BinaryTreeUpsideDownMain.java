package com.sac;

import java.util.Arrays;

public class BinaryTreeUpsideDownMain {

    public static void main(String[] args) {
        BinaryTreeUpsideDown binaryTreeUpsideDown = new BinaryTreeUpsideDown();
        TreeNode treeNode = new TreeNode(1);
        treeNode.leftNode = new TreeNode(2);
        treeNode.rightNode = new TreeNode(4);
        treeNode.leftNode.leftNode = new TreeNode(2);
        treeNode.leftNode.rightNode = new TreeNode(3);
        System.out.println("Tree Items before: ");
        displayItems(treeNode);
        TreeNode maxPath = binaryTreeUpsideDown.UpsideDownBinaryTree(treeNode);
        System.out.println("Tree Items after: ");
        displayItems(maxPath);

    }

    private static void displayItems(TreeNode treeNode){
        if (treeNode != null) {
            displayItems(treeNode.leftNode);
            System.out.println(treeNode.val);
            displayItems(treeNode.rightNode);
        }

    }
}
