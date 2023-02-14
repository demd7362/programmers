public class Solution {
    public int solution(int n) {
        int use = 0;
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                use++;
                n--;
            }
        }

        return use;
    }
}
