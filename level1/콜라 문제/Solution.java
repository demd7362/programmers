class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        int e = 0;
        e = n % a;
        while (n >= a) {
            n = n / a * b;
            sum += n;
            n += e;
            e = n % a;
        }
        return sum;
    }
}
