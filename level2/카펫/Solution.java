class Solution {
    public int[] solution(int brown, int yellow) {
        int sqrtNum = (int) Math.ceil(Math.sqrt(brown+yellow));
        int[] answer = new int[2];

        for(int width = sqrtNum; width<brown; width++) {
            for(int height = sqrtNum; height>0; height--) {
                if((width-2)*(height-2) == yellow && (width*height) == brown+yellow) {
                    answer = new int[] {width,height};                  
                }
            }
        }
        return answer;
    }
}
