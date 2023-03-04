import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String,Integer> wantMap = new HashMap<>();
        for(int i = 0; i<want.length; i++) {
            wantMap.put(want[i], number[i]); // K = 물건 V = 갯수
        }
        int days = 0;
       
        for(int i = 0; i<=discount.length-10; i++) {
            Map<String,Integer> tmp = new HashMap<>(wantMap);
            days++;
           
            for(int j=i; j<i+10; j++) {
            	String item = discount[j];
                Integer k = tmp.get(item);
                if(k != null) {
                    tmp.put(item, k-1);
                }
            }
            for(int value : tmp.values()) {
                if(value != 0) { // 갯수가 0이 아니다 => 조건이 충족되지 않음
                    days--;
                    break;
                }
            }

        }
        return days;
    }
}
