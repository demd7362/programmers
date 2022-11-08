class Solution {
    public long solution(int price, int money, int count) {
        long m = money;
        for (long i = 1; i <= count; i++) {
            m -= price * i;
        }
        return (m > 0) ? 0 : -m;
    }
}
