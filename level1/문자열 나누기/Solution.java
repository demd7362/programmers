class Solution {
    public int solution(String s) {
        char prev = ' ';
        int cnt = 0,answer = 0;
        boolean isFirst = true;
        for(char curr : s.toCharArray()){
            if(isFirst){ // 나눠서 start
                prev = curr;
                cnt = 1;
                answer++;
            } else {
                cnt += prev == curr ? 1:-1;
            }
            isFirst = cnt == 0;
        }
        return answer;
    }
}
