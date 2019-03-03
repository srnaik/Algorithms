package com.sac;

import java.util.LinkedList;
import java.util.List;

public class Graph {

    public static void breadthFirstSearch(Node node){

        List<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            node = queue.get(0);
            if(node.leftNode != null){
                int index = queue.size();
                queue.add(index,node.leftNode);
            }
            if(node.rightNode != null){
                int index = queue.size();
                queue.add(index,node.rightNode);
            }
            System.out.println(queue.get(0).data + " ");
            queue.remove(0);
        }
    }

    public static void depthFirstSearch(Node node){

        if(node.leftNode == null && node.rightNode == null){
            System.out.println(node.data + " ");
            node.isVisited = true;

        } else if(node.leftNode == null || node.leftNode.isVisited){
            depthFirstSearch(node.rightNode);
            System.out.println(node.data + " ");
            node.isVisited = true;
        }else{
            depthFirstSearch(node.leftNode);
            System.out.println(node.data + " ");
            node.isVisited = true;
            depthFirstSearch(node.rightNode);
        }


    }
}
