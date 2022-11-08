import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (!stack.isEmpty() && stack.peek() != i) {
                stack.push(i);
            } else if (stack.isEmpty()) {
                stack.push(i);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
