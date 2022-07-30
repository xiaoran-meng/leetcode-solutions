package ca.umanitoba.cs.leetcode.q225;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    static class Solution {
        private Queue<Integer> sink, producer;

        Solution() {
            sink = new LinkedList<>();
            producer = new LinkedList<>();
        }

        public void push(int value) {
            sink.offer(value);
            while (!producer.isEmpty()) {
                sink.offer(producer.poll());
            }

            Queue<Integer> queue = sink;
            sink = producer;
            producer = queue;
        }

        public int peek() {
            return producer.peek();
        }

        public int top() {
            return producer.poll();
        }

        public boolean empty() {
            return sink.isEmpty() && producer.isEmpty();
        }
    }
}
