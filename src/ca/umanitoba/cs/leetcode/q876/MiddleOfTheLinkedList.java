package ca.umanitoba.cs.leetcode.q876;

import ca.umanitoba.cs.leetcode.common.ListNode;

public class MiddleOfTheLinkedList {
    static class Solution {
        public ListNode middleOfList(ListNode head) {
            ListNode walker = head, runner = head;
            while (runner != null && runner.next != null) {
                walker = walker.next;
                runner = runner.next.next;
            }
            return walker;
        }
    }
}
