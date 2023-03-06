import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];
        char[] chars = s.toCharArray();
        int i = 0;
        for(char c : chars) {
            Integer target = map.get(c); 
            if(target == null) { // 현재 글자와 동일한 글자가 key에 없다면,
                map.put(c, s.indexOf(c)); // 글자를 key, 글자의 위치를 value로 맵에 넣는다
                answer[i++] = -1; 
            } else { // 현재 글자와 동일한 글자가 이미 key에 있다면,
                map.put(c, s.indexOf(c, target+1)); // 글자를 key, 현재 해당하는 글자의 위치를 value로 맵에 넣는다
                answer[i++] = map.get(c) - target; // 현재 글자의 위치 - 현재 글자의 위치보다 앞에 있는 동일한 글자의 위치
            }
        }
        return answer;
    }
}
