import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int mixCnt = 0;
		Queue<Integer> pq = new PriorityQueue<>();
		pq.addAll(Arrays.asList(Arrays.stream(scoville).boxed().toArray(Integer[]::new)));
		
		while(pq.size() > 1 && pq.peek() < K) {
			int f = pq.poll();
			int s = pq.poll();
			int mixed = f + s * 2;
			pq.offer(mixed);
			mixCnt++;
		}
        
        return pq.peek() < K? -1 : mixCnt; 
    }
}
