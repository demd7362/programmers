import java.util.*;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		List<Integer> losted = new ArrayList<>(Arrays.asList(Arrays.stream(lost).boxed().toArray(Integer[]::new))); // int[] lost 배열을 ArrayList로 
		List<Integer> reserved = new ArrayList<>(Arrays.asList(Arrays.stream(reserve).boxed().toArray(Integer[]::new))); // int[] reserve 배열을 ArrayList로
		List<Integer> intersection = new ArrayList<>(losted); // 교집합을 구하기 위한 임시 리스트
		intersection.retainAll(reserved); // 교집합을 구하는 메소드
		losted.removeAll(intersection); // 구한 교집합의 요소를 두 List에서 제거
		reserved.removeAll(intersection);
		
		/* for(int i : intersection) { remove 메소드 안에 들어가는 값은 Integer여야만 한다.
			Integer integer = i;
			losted.remove(integer); => integer에 해당하는 요소 제거
			reserved.remove(i); => i번째 인덱스 제거
		} */
    
		Collections.sort(losted); // for문을 돌리기 위한 ArrayList 정렬
		Collections.sort(reserved);
		for (int i = 0; i < reserved.size(); i++) { // 향상된 for문을 썼을 때, List 안의 요소를 제거하면 ConcurrentModificationException이 발생
			int reserveNum = reserved.get(i);
			for (int j = 0; j < losted.size(); j++) {
				int lostNum = losted.get(j);
				if (lostNum >= reserveNum - 1 && lostNum <= reserveNum + 1) {
					losted.remove(j);
					reserved.remove(i);
					i--;
					break;
				}
			}
		}
		return n - losted.size();
	}
}
