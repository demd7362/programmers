import java.util.*;
class Solution {
    public static char setAlphabet(int target) {
        return (char) ((target - 97) % 26 + 97); 
      // char의 범위는 'a' ~ 'z'(97~122) 먼저 97을 빼서 26으로 나눈 값의 나머지에 다시 97을 더한다 ex) 123 ('z'를 1 초과한 값) - 97 = 26 % 26 = 0 + 97 = 97 즉 'a'
    }

    public static char skipCalculator(char target,int index, String skip) {
        for(int i=1; i<=index; i++) {
            char tmp = setAlphabet(target + i); // 변수에 담기 전에 'z'를 초과한 값을 변환해주는 변환식 적용
            if(skip.indexOf(tmp) != -1) { // contains 메소드를 써도 된다. skip에 임시 변수에 담은 값이 있다면 탐색 범위값을 늘린다
                index++;
            }
        }
        return setAlphabet(target + index); // 최종적으로 스킵하는 분량까지 더해진 index 값에 target을 더하고 변환식 적용
    }
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            char value = skipCalculator(c, index, skip);
            sb.append(value);
        }
        return sb.toString();
    }
}
