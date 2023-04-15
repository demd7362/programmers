import java.util.*;
import java.util.Map.Entry;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);
		}
		for(String call : callings) { // 시간 초과가 뜨므로 인덱스와 밸류값을 map에 저장
			int idx = map.get(call);
			int targetIdx = idx - 1;
			String target = players[targetIdx];
			players[idx] = target;
			players[targetIdx] = call;
			map.put(call, targetIdx);
			map.put(target, idx);
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			answer[entry.getValue()] = entry.getKey();
		} 
        return answer;
    }
}
