import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] first = new String[strings.length];
        String[] second = new String[strings.length];
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            first[i] = strings[i].substring(0, n);
            second[i] = strings[i].substring(n, strings[i].length());
        }
        Arrays.sort(second);
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (strings[i].equals(first[i] + second[j])) {
                    answer[j] = String.valueOf(strings[i].charAt(n)) + first[i] + second[j];
                    break;
                }
            }
        }
        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1, answer[i].length());
        }
        return answer;
    }
}
