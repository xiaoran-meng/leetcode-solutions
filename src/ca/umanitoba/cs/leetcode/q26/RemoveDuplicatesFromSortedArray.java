package ca.umanitoba.cs.leetcode.q26;

public class RemoveDuplicatesFromSortedArray {
    static class Solution {

        public int removeDuplicates(int[] sorted) {
            int i = 0;
            for (int j = 1; j < sorted.length; j++) {
                if (sorted[j] != sorted[i]) {
                    sorted[i + 1] = sorted[j];
                    i++;
                }
            }
            return i + 1;
        }
    }
}
