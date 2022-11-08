class Solution {
    public int solution(int[][] sizes) {
        int maxPartner = 0;
        int max = 0;
        for (int i = 0; i < sizes.length; i++) {
            max = (sizes[i][0] > sizes[i][1]) ? ((max > sizes[i][0]) ? max : sizes[i][0])
                    : ((max > sizes[i][1]) ? max : sizes[i][1]);
        }
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] == max) {
                maxPartner = sizes[i][1];
                break;
            } else if (sizes[i][1] == max) {
                maxPartner = sizes[i][0];
                break;
            }
        }
        int min = maxPartner;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > min && sizes[i][1] > min) {
                min = (sizes[i][0] < sizes[i][1]) ? (sizes[i][0] > min) ? sizes[i][0] : min
                        : (sizes[i][1] > min) ? sizes[i][1] : min;
            }
        }
        return max * min;
    }
}
