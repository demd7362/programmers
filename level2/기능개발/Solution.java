import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<progresses.length; i++) {
			queue.offer((int) Math.ceil((100-progresses[i])/(double)speeds[i])); // 프로세스 별로 걸리는 시간 계산해서 queue에 넣는다
		}
		int cnt = 1; // 배포 시 프로젝트의 수
		int tmp = 0; // queue에서 꺼낸 밸류를 저장해놓을 변수
		List<Integer> list = new ArrayList<>();
		while(true) {
			int targetItem = tmp != 0? tmp: queue.poll(); // 변수에 뭔가 저장되어있다면 가져오고, 아니라면 queue에서 꺼낸다
			int peekedItem = 0; // target과 비교할 대상 
			if(!queue.isEmpty()) { 
				peekedItem = queue.peek(); // queue가 비어있지 않다면 비교할 대상을 변수에 저장
			} else break; // queue가 비어있다면 반복문 종료
			
			if(targetItem >= peekedItem) { // 앞선 프로젝트가 뒤에 있는 프로젝트보다 기간이 오래 걸린다면,
				tmp = targetItem; // tmp에 앞선 프로젝트의 걸리는 시간을 저장
				cnt++; 
				queue.poll(); // 비교한 대상을 꺼낸다
			} else {
				tmp = 0; // 앞선 프로젝트가 뒤에 있는 프로젝트보다 짧게 걸린다면, tmp를 0으로 초기화
				list.add(cnt); // 리스트에 넣는다
				cnt = 1; // 리스트에 넣었으니 cnt를 0으로 초기화
			}
		}
		list.add(cnt); // queue에 남아있는 요소가 없어서 반복문이 종료되고, 남아있는 cnt를 마지막으로 list에 넣는다
        return list;
    }
}
