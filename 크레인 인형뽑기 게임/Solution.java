import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < moves.length; i++) {
            int tmp = moves[i];
            for (int j = 0; j < board.length; j++) {
                if (board[j][tmp - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][tmp - 1]) {
                        stack.pop();
                        cnt += 2;
                        board[j][tmp - 1] = 0;
                        break;
                    } else if (stack.isEmpty() || stack.peek() != board[j][tmp - 1]) {
                        stack.push(board[j][tmp - 1]);
                        board[j][tmp - 1] = 0;
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}
