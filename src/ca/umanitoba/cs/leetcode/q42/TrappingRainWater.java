package ca.umanitoba.cs.leetcode.q42;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {
    static class Solution {
        public int trap(int[] heights) {
            int result = 0;
            Deque<Integer> stack = new ArrayDeque<>();
            for (int rightBoundIndex = 0; rightBoundIndex < heights.length; rightBoundIndex++) {
                while (!stack.isEmpty() && heights[stack.peek()] < heights[rightBoundIndex]) {
                    int trapIndex = stack.pop();
                    if (stack.isEmpty()) break; // no left bound
                    int leftBoundIndex = stack.peek();
                    result += getWaterInTrap(heights, leftBoundIndex, rightBoundIndex, trapIndex);
                }
                stack.push(rightBoundIndex);
            }
            return result;
        }

        private int getWaterInTrap(int[] heights, int leftBoundIndex, int rightBoundIndex, int trapIndex) {
            int trapWidth = rightBoundIndex - leftBoundIndex - 1;
            int trapHeight = Math.min(heights[rightBoundIndex], heights[leftBoundIndex]) - heights[trapIndex];
            return trapWidth * trapHeight;
        }
    }
}
