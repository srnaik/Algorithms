package com.sac;

public class BinaryTreeUpsideDown {


    public TreeNode UpsideDownBinaryTree(TreeNode root) {
        return dfsBottomUp(root, null);
    }

    private TreeNode dfsBottomUp(TreeNode p, TreeNode parent) {
        if (p == null) return parent;
        TreeNode root = dfsBottomUp(p.leftNode, p);
        p.leftNode = (parent == null) ? parent : parent.rightNode;
        p.rightNode = parent;
        return root;
    }
}