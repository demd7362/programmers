public class Solution {
    public int solution(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        int answer = sum;
        return answer;
    }
}
