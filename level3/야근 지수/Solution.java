import java.util.*;

class Solution {
	public long solution(int n, int[] works) {
		long answer = 0;
		int sum = 0;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int work : works) {
			priorityQueue.offer(work);
			sum += work;
		}
		if (sum < n) return 0;
		while (n > 0) {
			int i = priorityQueue.poll();
			priorityQueue.offer(--i);
			n--;
		}
		while (!priorityQueue.isEmpty()) {
			answer += Math.pow(priorityQueue.poll(), 2);
		}

		return answer;
	}
}
