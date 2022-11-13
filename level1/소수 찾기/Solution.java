class Solution {
    public int primeNum(int n) { // 소수가 아니라면 0(false) 소수라면 1(true)
        for (int i = 2; i <= (int) Math.sqrt(n); i++) { // 소수 판정하기
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int solution(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            if ((primeNum(i) == 1)) { // 소수의 갯수 구하기
                result++;
            }
        }
        return result;
    }
}
