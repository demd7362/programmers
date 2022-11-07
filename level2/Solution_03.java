import java.util.*;

class Solution_03
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        Integer[] C = new Integer[B.length];
        for(int i=0; i<B.length; i++){
            C[i] = B[i]; 
        }
        Arrays.sort(A);
        Arrays.sort(C,Collections.reverseOrder());
        
        for(int i=0; i<A.length; i++){
            sum += A[i] * C[i];
        }
        return sum;
    }
}
