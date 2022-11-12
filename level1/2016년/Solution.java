import java.time.LocalDateTime;

class Solution {
    public String solution(int a, int b) {
        LocalDateTime ldt = LocalDateTime.of(2016, a, b, 0, 0, 0);
        String answer = ldt.getDayOfWeek().toString().substring(0, 3);
        return answer;
    }
}
