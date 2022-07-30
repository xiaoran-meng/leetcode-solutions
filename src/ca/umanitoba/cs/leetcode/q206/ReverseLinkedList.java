package ca.umanitoba.cs.leetcode.q206;

import ca.umanitoba.cs.leetcode.common.ListNode;

public class ReverseLinkedList {
    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode result = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return result;
        }
    }
}
