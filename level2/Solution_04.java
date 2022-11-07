class Solution_04 {
    boolean solution(String s) {
        int cnt = 0;
        char[] arr = s.toCharArray();
        for(char c : arr){
            cnt += (c == '(')? 1:-1;
            if(cnt<0) return false;
        }
        return (cnt != 0)? false:true;
    
    }
}
