import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 오름차순 정렬후 0번인덱스부터 -= 계산
        Arrays.sort(d);
        int cnt = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                budget += d[i];
            } else
                cnt++;
        }
        return cnt;
    }
}
