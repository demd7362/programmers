class Solution {
    public int solution(int[] numbers) {
        int sum1 = 0;
        for (int i : numbers) {
            sum1 += i; // 배열 합
        }
        int sum2 = 0;
        for (int j = 0; j <= 9; j++) {
            sum2 += j;
        }
        return sum2 - sum1;
    }
}
