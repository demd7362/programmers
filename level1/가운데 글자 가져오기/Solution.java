class Solution {
    public String solution(String s) {
        String str = (s.length()%2==1)? ""+s.charAt((s.length()-1)/2):""+s.charAt((s.length()/2)-1)+s.charAt(s.length()/2);
        
        return str;
    }
}
