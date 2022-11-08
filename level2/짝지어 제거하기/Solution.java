import java.util.*;
class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>(); // "ccbaabaa"
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i); // tmp에 c 저장
            if (!stack.isEmpty() && stack.peek() == tmp) { // 스택을 들여다봤을때 tmp면
                stack.pop(); // 뺀다
            } else
                stack.push(tmp); // 들여본 스택이 tmp가 아니면 넣어
        }
        return (stack.isEmpty()) ? 1 : 0;
    }
}
