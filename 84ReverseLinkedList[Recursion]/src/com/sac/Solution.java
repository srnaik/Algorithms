package com.sac;

public class Solution {

    public ListNode reverserNode(ListNode head) {

        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode reversedList = solution.reverserNode(head);
        System.out.println("******** Reversed List ********");
         while (reversedList != null){
             System.out.print(reversedList.val + "\t");
             reversedList = reversedList.next;
         }
    }
}
