package com.sac;

public class Solution {


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode preHead = new ListNode(-1);
        ListNode curr = preHead;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = list1 != null ? list1 : list2;
        return preHead.next;
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode listNode = solution.mergeTwoLists(list1, list2);
        System.out.println("List Node after merging: ");
        while (listNode != null) {
            System.out.print(listNode.val + "\t");
            listNode = listNode.next;
        }
    }
}
