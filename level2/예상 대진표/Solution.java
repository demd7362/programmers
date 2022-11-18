class Solution {
    public int solution(int n, int a, int b) {
        int round = 0;
        while (true) {
            a = (a % 2 == 0) ? a / 2 : a / 2 + 1;
            b = (b % 2 == 0) ? b / 2 : b / 2 + 1;
            round++;
            if (a == b)
                break;
        }
        return round;
    }
}
