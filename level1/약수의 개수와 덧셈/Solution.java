class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int j = left; j <= right; j++) {
            int count = 0;
            for (int i = 1; i <= j; i++) { // 범위값 left~right 약수의 개수 구하기
                if (j % i == 0) {
                    count++; // 약수의 개수
                }
            }
            if (count % 2 == 0) { // 약수의 개수가 짝수
                sum += j;
            } else
                sum -= j;
        }
        return sum;
    }
}
