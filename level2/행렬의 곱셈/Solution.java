class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length]; 

        for(int n = 0; n<arr1.length; n++) {
            for(int i=0; i<arr2[0].length; i++) {
                for(int j=0; j<arr1[0].length; j++) { 
                    answer[n][i] += arr1[n][j] * arr2[j][i];
                }

            }
        }
        return answer;
    }
}
