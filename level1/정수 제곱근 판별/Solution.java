class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long x = 1; x <= n; x++) {
            if (x * x == n) {
                answer = (long) Math.pow(x + 1, 2);
                break;
            } else
                answer = -1;
        }
        return answer;
    }
}
