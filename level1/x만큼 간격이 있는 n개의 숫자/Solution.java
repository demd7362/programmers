class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = x;
        for (int i = 0; i < n; i++) {
            answer[i] = a;
            a += x;
        }
        return answer;
    }
}
