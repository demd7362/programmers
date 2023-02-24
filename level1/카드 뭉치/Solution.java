import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        while(goal.length > 0) {
            int idx = cards1.length != 0 && goal[0].equals(cards1[0])? 1: cards2.length != 0 && goal[0].equals(cards2[0])? 2:0;
            switch(idx) {
            case 1 : 
                cards1 = Arrays.copyOfRange(cards1, 1, cards1.length);
                goal = Arrays.copyOfRange(goal, 1, goal.length);
                break;
            case 2 : 
                cards2 = Arrays.copyOfRange(cards2, 1, cards2.length);
                goal = Arrays.copyOfRange(goal, 1, goal.length);
                break;
            default : return "No";
            }
        }
        return "Yes";
    }
}
