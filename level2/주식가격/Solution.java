import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        loop:
        for(int i=0; i<prices.length-1; i++) {
            answer[i] = prices.length -1 -i;
            for(int j=i+1; j<prices.length-1; j++) {
                if(prices[i] > prices[j]) { // 주가떨어짐
                    answer[i] = j-i;
                    continue loop;
                }
            }
        }
        return answer;
    }
}
