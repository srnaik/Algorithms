package com.sac;

import java.util.List;

public class MergeLists {

    public ListNode mergeKLists(List<ListNode> lists){

        if(lists == null || lists.isEmpty())
            return null;

        int end = lists.size()-1;
        while (end > 0){
            int begin = 0;
            while (begin < end){
                lists.set(begin,merge2Lists(lists.get(begin), lists.get(end)));
                begin++;
                end--;
            }
        }

        return lists.get(0);
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2){

        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1 != null) p.next = l1;
        if(l2 != null) p.next = l2;

        return dummyNode.next;
    }
}
