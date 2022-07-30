package ca.umanitoba.cs.leetcode.q739;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    static class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] result = new int[temperatures.length];
            Deque<Integer> stack = new ArrayDeque<>();
            
            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int k = stack.pop();
                    result[k] = i - k;
                }

                stack.push(i);
            }

            return result;
        }
    }
}
