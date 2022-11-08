class Solution {
    public String solution(String s) {
        int cnt = 0;
        String[] arr = s.split("");
        String str = "";
        for (String i : arr) {
            cnt = i.equals(" ") ? 0 : cnt + 1;
            str += (cnt % 2 == 0) ? i.toLowerCase() : i.toUpperCase();
        }
        return str;
    }
}
