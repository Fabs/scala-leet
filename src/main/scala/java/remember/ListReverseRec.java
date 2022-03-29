package leet.java.remember;

import leet.java.problem.ListNode;

public class ListReverseRec {
    public ListNode reverseList(ListNode head) {
        return reverseListRec(head, null);
    }

    public ListNode reverseListRec(ListNode head, ListNode reversed) {
        if(head == null) {
            return reversed;
        }

        ListNode nextReverse = head.next;
        head.next = reversed;
        return reverseListRec(nextReverse, head);
    }
}
