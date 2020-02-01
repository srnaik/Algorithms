package com.sac;

import java.util.ArrayList;
import java.util.List;

public class MergeKSortedListsMain {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l1a = new ListNode(2);
        ListNode l1b = new ListNode(3);
        l1a.next = l1b;
        l1.next = l1a;


        ListNode l2 = new ListNode(4);
        ListNode l2a = new ListNode(5);
        ListNode l2b = new ListNode(6);
        l2a.next = l2b;
        l2.next = l2a;

        ListNode l3 = new ListNode(4);
        ListNode l3a = new ListNode(8);
        ListNode l3b = new ListNode(10);
        l3a.next = l3b;
        l3.next = l3a;

        ListNode l4 = new ListNode(11);
        ListNode l4a = new ListNode(14);
        ListNode l4b = new ListNode(16);
        l4a.next = l4b;
        l4.next = l4a;


        List<ListNode> arList = new ArrayList<>();
        arList.add(l1);
        arList.add(l2);
        arList.add(l3);
        arList.add(l4);

        MergeLists mergeLists = new MergeLists();
        ListNode result = mergeLists.mergeKLists(arList);

        while (result != null){
            System.out.print(result.val + "\t");
            result = result.next;
        }
    }
}
