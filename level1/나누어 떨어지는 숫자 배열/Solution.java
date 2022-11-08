import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                al.add(i);
            }
        }
        if (al.size() == 0) {
            al.add(-1);
        }
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
