class Solution {
    public int[] solution(int n, int m) {
        int i;
        for (i = (m > n) ? m : n; i > 0; i--) {
            if (m % i == 0 && n % i == 0)
                break;
        }
        int[] arr = { i, (m * n) / i };
        return arr;
    }
}
