class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for (int i = 1; true; i++) {
            int cnt = 0;
            for (int j : citations) {
                if (i <= j)
                    cnt++;
            }
            if (cnt <= i) {
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}
