import java.util.*;
class Solution_12 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        for (int i = arr[0],cnt = 0 ; cnt != arr.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((i * arr[arr.length-1]) % arr[j] == 0) {
                    answer = i * arr[arr.length-1];
                    cnt++;
                }
            }
        }
        return answer;
    }
}