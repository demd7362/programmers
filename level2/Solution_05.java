class Solution_05 {
    public int[] solution(String s) {
        int cnt = 0;
        int cycle = 0;
        while(s.length()>1){
            String str ="";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1') str += "1";
                    else cnt++;
            }
            s = Integer.toBinaryString(str.length());
        cycle++;
        }
        int[] answer = {cycle,cnt};
        return answer;
    }
}
