package com.sac;

public class SwapNodesImpl {

    public static void main(String[] args) {

        ListNode rootNode = new ListNode(10);
        rootNode.next = new ListNode(20);
        rootNode.next.next = new ListNode(30);
        rootNode.next.next.next = new ListNode(40);

        SwapNodesImpl swapNodes = new SwapNodesImpl();
        System.out.println("Nodes before Swap");
        swapNodes.display(rootNode);

        ListNode resultNode = swapNodes.swapNodes(rootNode);
        System.out.println("Nodes after Swap");
        swapNodes.display(resultNode);

    }


    private ListNode swapNodes(ListNode node){

        ListNode dummyNode = new ListNode(0);
        ListNode prev = dummyNode, p = node;

        while (p != null && p.next != null){

            ListNode q = p.next, r = p.next.next;
            q.next = p;
            prev.next = q;
            p.next = r;
            prev = p;
            p = r;
        }

        return dummyNode.next;
    }

    private void display(ListNode rootNode){

        while (rootNode != null){
            if(rootNode.next != null)
                System.out.print(rootNode.data + "->");
            else
                System.out.println(rootNode.data);
            rootNode = rootNode.next;
        }
    }
}
