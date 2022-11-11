import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        String str = "";
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            str = "";
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                str += array[j] + " ";
            }
            System.out.println(str);
            String[] arr = str.split(" ");
            for (int k = 0; k < arr.length; k++) {
                for (int l = k + 1; l < arr.length; l++) {
                    if (Integer.parseInt(arr[k]) > Integer.parseInt(arr[l])) {
                        String tmp = arr[k];
                        arr[k] = arr[l];
                        arr[l] = tmp;
                    }
                }
            }
            answer[i] = Integer.parseInt(arr[commands[i][2] - 1]);
        }
        return answer;
    }
}
