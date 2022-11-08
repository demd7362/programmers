class Solution {
    public boolean solution(String s) {
        char[] arr = s.toCharArray();
        boolean answer = true;
        if (s.length() > 8)
            return false;
        if (s.length() == 4 || s.length() == 6) { // 문자열의 길이가 4 또는 6이 아니라면 false
            for (char c : arr) {
                if (!(c > 46 && c < 59)) { // 47~58 값이 없으면 false
                    answer = false;
                }
            }
        } else
            answer = false;
        return answer;
    }
}
