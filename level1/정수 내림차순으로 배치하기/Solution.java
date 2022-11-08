import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String str = "";
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String s : arr) {
            str += s;
        }
        return Long.parseLong(str);
    }
}
