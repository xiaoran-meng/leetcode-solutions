package ca.umanitoba.cs.leetcode.q344;

public class ReverseString {
    static class Solution {
        public char[] reverseString(char[] s) {
            int i = 0, j = s.length - 1;
            while (i < j) {
                swap(s, i, j);
                i++;
                j--;
            }
            return s;
        }

        private void swap(char[] s, int i, int j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
