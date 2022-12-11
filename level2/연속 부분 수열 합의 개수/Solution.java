import java.util.*;
class Solution {
    public int solution(int[] e) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < e.length; i++) {
            int sum = 0;
            for (int j = 0; j <e.length; j++) {
                sum += e[(j+i) % e.length];
                set.add(sum);
            }
        }
        return set.size();
    }
}
