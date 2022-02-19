package com.sac;

public class Solution {

    public ListNode removeNthNodeFromEnd(ListNode head, int n) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        int length = 0;

        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }

        length -= n;
        first = dummyNode;

        while (length > 0) {
            first = first.next;
            length--;
        }

        first.next = first.next.next;
        return dummyNode.next;
    }
}
