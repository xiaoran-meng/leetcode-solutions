package ca.umanitoba.cs.leetcode.q735;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    static class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int a : asteroids) {
                if (a > 0) {
                    // []   5
                    // [5]  5
                    // [-5] 5
                    stack.push(a);
                } else { // a < 0                    
                    while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) { // [3]  -5
                        stack.pop();
                    }

                    // [-3] -5
                    // []   -5
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(a);
                    } else if (stack.peek() == -a) { // [5]  -5
                        stack.pop();
                    } // [10] -5
                }
            }

            // [1 2 3] ->
            // [] <- 3 2 1
            int[] result = new int[stack.size()];
            for (int i = result.length - 1; i >= 0 ; i--) {
                result[i] = stack.pop();
            }

            return result;
        }
    }
}
