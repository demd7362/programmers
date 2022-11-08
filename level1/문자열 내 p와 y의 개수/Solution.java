class Solution {
    boolean solution(String s) {
        boolean answer;
        char[] arr = s.toCharArray();
        int countp = 0;
        int county = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'y' || arr[i] == 'Y') {
                county++;
            } else if (arr[i] == 'p' || arr[i] == 'P')
                countp++;
        }
        if (county == countp) {
            answer = true;
        } else if (county + countp == 0) {
            answer = true;
        } else
            answer = false;
        return answer;
    }
}
