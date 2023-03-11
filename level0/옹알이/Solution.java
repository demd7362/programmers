class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
        for(int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replaceFirst("aya", "!");
            babbling[i] = babbling[i].replaceFirst("ye", "!");
            babbling[i] = babbling[i].replaceFirst("woo", "!");
            babbling[i] = babbling[i].replaceFirst("ma","!");
            babbling[i] = babbling[i].replace("!", "");
            if(babbling[i].isEmpty()) cnt++;
        }
        return cnt;
    }
}
