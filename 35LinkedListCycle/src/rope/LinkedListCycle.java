package rope;

public class LinkedListCycle {

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null)
            return false;
        ListNode slow = head, fast = head.next;
        while (slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = two;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean isCycle = linkedListCycle.hasCycle(head);
        if(isCycle)
        System.out.println("This given Linked List contains a cycle");
        else
            System.out.println("This given Linked List doesn't contain a cycle");


    }
}
