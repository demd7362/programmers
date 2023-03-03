import java.util.*;

class VO {
	private int idx;
	private int priority;
	public VO(int idx, int priority) {
		this.idx = idx;
		this.priority = priority;
	}
	public int getIdx() {
		return idx;
	}
	public int getPriority() {
		return priority;
	}
}

class ImprovedSolution {
    public int solution(int[] priorities, int location) {
        Queue<VO> queue = new LinkedList<>();
        for(int i = 0; i<priorities.length; i++) {
            queue.offer(new VO(i,priorities[i]));
        }

        int printOrder = 0;
        while(!queue.isEmpty()) {
            VO vo = queue.poll();
            int idx = vo.getIdx();
            int priority = vo.getPriority();
            if(!isBiggerExist(priority, queue.iterator())) {
                printOrder++;
                if(idx == location) break;
            } else {
                queue.offer(vo);
            }
        }
		return printOrder;
		
	}
	
	public static boolean isBiggerExist(int targetPriority, Iterator<VO> iter) {
		while(iter.hasNext()) {
			if(iter.next().getPriority() > targetPriority) {
				return true;
			}
		}
		return false;
	}
    
}
