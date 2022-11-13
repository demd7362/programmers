class Solution {
    public int answer(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int solution(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (answer((nums[i] + nums[j] + nums[k])) == 1) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
