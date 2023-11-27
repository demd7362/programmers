import java.util.List;

class Solution {
    int minRange;
    int maxRange;
    int h;
    int w;
    String[][] board;
    String targetColor;
    public boolean isSameColor(int h,int w){
        if(this.h == h && this.w == w) return false;
        return this.targetColor.equals(this.board[h][w]);
    }
    public int getInRange(int n){
        if(n < this.minRange){
            return this.minRange;
        }
        return Math.min(n, maxRange);
    }
    public int solution(String[][] board, int h, int w){
        this.h = h;
        this.w = w;
        this.minRange = 0;
        this.maxRange = board.length - 1;
        this.board = board;
        this.targetColor = board[h][w];
        List<Boolean> list = List.of(
                isSameColor(getInRange(h-1),getInRange(w)),
                isSameColor(getInRange(h),getInRange(w-1)),
                isSameColor(getInRange(h),getInRange(w+1)),
                isSameColor(getInRange(h+1),getInRange(w))
        );
        return list.stream()
                .reduce(0, (count, value) -> value ? count + 1 : count, Integer::sum);
    }
}
