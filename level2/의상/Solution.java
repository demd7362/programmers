import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String,Integer> map = new HashMap<>();
        int answer = 1;
        for(String[] cloth : clothes){
            map.put(cloth[1],map.getOrDefault(cloth[1],1)+1); // 옷 카테고리별 갯수
        }
        for(var entry : map.entrySet()){
            answer *= entry.getValue(); // 경우의 수를 구한다
        }
        return answer - 1; // answer = 1로 초기화했기 때문에
    }
}
