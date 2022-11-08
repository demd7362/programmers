class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num == 1) {
            return answer;
        }
        long n = (long) num;
        for (answer = 1; answer <= 500; answer++) {
            if (n % 2 == 0) {
                n /= 2;
            } else
                n = (n * 3) + 1;
            if (n == 1) {
                return answer;
            } else if (answer == 500) {
                return -1;
            }
        }
        return answer;
    }
}
