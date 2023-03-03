import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Map<Integer,Integer>> queue = new LinkedList<>();
        for(int i = 0; i<priorities.length; i++) {
            Map<Integer,Integer> map = new HashMap<>();
            map.put(i, priorities[i]); // K = idx, V = priority
            queue.offer(map);
        }

        int printOrder = 0;
        while(!queue.isEmpty()) {
            int idx = 0;
            int priority = 0;
            for(Entry<Integer,Integer> entry : queue.peek().entrySet()) {
                idx = entry.getKey();
                priority = entry.getValue();
            }
            Map<Integer,Integer> targetMap = queue.poll();
            Queue<Map<Integer,Integer>> tmpQueue = new LinkedList<>();
            tmpQueue.addAll(queue);
            if(!isBiggerExist(priority, tmpQueue)) {
                printOrder++;
                if(idx == location) break;
            } else {
                queue.offer(targetMap);
            }

        }
        return printOrder;

    }

    public static boolean isBiggerExist(int targetPriority, Queue<Map<Integer,Integer>> queue) {
        while(!queue.isEmpty()) {
            for(Entry<Integer,Integer> entry : queue.poll().entrySet()) {
                if(entry.getValue() > targetPriority) {
                    return true;
                }
            }
        }
        return false;
    }

}
