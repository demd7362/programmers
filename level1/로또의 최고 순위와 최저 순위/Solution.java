import java.util.*;

class Solution {
    public static int lottery(int correct) {
        switch (correct) {
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        int min = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                max++;
            } else
                al.add(lottos[i]);
        }
        for (int i = 0; i < win_nums.length; i++) {
            if (al.contains(win_nums[i])) {
                min++;
            }
        }

        return new int[] { lottery(max + min), lottery(min) };
    }
}
