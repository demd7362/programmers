import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (String oper : operations) {
            int number = Integer.parseInt(oper.substring(2));
            if (oper.startsWith("I")) {
                queue.offer(number);
            } else {
                if(number == 1) { // 리버스오더
                    PriorityQueue<Integer> oldQueue = new PriorityQueue<>(Collections.reverseOrder());
                    oldQueue.addAll(queue);
                    queue = new PriorityQueue<>(Collections.reverseOrder());
                    queue.addAll(oldQueue);
                    queue.poll();
                } else {
                    PriorityQueue<Integer> oldQueue = new PriorityQueue<>();
                    oldQueue.addAll(queue);
                    queue = new PriorityQueue<>();
                    queue.addAll(oldQueue);
                    queue.poll();
                }
            }

        }
        int[] answer = new int[2];
        if(!queue.isEmpty()) {
            PriorityQueue<Integer> oldQueue = new PriorityQueue<>(Collections.reverseOrder());
            oldQueue.addAll(queue);
            queue = new PriorityQueue<>(Collections.reverseOrder());
            queue.addAll(oldQueue);
            answer[0] = queue.peek();
            oldQueue = new PriorityQueue<>();
            oldQueue.addAll(queue);
            queue = new PriorityQueue<>();
            queue.addAll(oldQueue);
            answer[1] = queue.peek();
        } 
        return answer;
    }
}
