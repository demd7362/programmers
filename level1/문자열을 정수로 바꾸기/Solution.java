class Solution {
    public int solution(String s) {
        int answer = 0;
        // "+1234"
        if (s.charAt(0) == '+') {
            s = s.substring(1, s.length());
            answer = Integer.parseInt(s);
        } else if (s.charAt(0) == '-') {
            s = s.substring(1, s.length());
            answer = Integer.parseInt(s);
            answer -= 0;
        } else
            answer = Integer.parseInt(s);
        return answer;
    }
}
