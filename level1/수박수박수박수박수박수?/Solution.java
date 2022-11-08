class Solution {
    public String solution(int n) {
        String str = "";
        for (int i = n; i > 0; i--) {
            str += (n % 2 == 0) ? ((i % 2 == 0) ? "수" : "박") : ((i % 2 == 0) ? "박" : "수");
        }
        return str;
    }
}
