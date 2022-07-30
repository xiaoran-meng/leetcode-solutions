package ca.umanitoba.cs.leetcode.q1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static class Solution {
        public int[] twoSum(int[] values, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < values.length; i++) {
                int complement = target - values[i];
                if (map.containsKey(complement)) {
                    return new int[] { i, map.get(complement) };
                }
                map.put(values[i], i);
            }
            throw new RuntimeException("Not found");
        }
    }
}
