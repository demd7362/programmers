import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        return (hs.size() > pick) ? pick : hs.size();
    }
}
