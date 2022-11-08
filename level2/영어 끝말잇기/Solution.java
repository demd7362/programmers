import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            // 중복 
            al.add(words[i - 1]);
            if (al.contains(words[i])) {
                System.out.println("중복감지문 i: " + i);
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            // 끝말잇기 실패 
            else if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                System.out.println("틀림감지문 i: " + i);
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }
}
