package ca.umanitoba.cs.leetcode.q19;

import ca.umanitoba.cs.leetcode.common.ListNode;

public class RemoveNthFromEndOfList {
    static class Solution {
        // o 1 2 3 n = 3
        // l     r
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode node = new ListNode(0, head), left = node, right = node;
            
            for (int i = 0; i < n && right != null; i++) {
                right = right.next;
            }

            if (right == null) {
                throw new RuntimeException("n cannot be gretaer than the length of the list");
            }

            while (right.next != null) {
                left = left.next;
                right = right.next;
            }

            left.next = left.next.next;
            return node.next;
        } 
    }
}
