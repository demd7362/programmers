class Solution_06 {
    public int solution(int n) {
        int j = 1;
        int cnt = 1;
        while(j<n){
            int sum = 0;
            for(int i=j; i<=n; i++){
                sum += i;
                if(sum == n) {
                    cnt++;
                    j++;
                    sum = 0;
                    break;
                } else if(sum>n) {
                    j++;
                    break;
                }
            } 
        }    
        return cnt;
    }
}
