class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[i] < arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        String answer = "";
        for (char c : arr) {
            answer += c;
        }
        return answer;
    }
}
