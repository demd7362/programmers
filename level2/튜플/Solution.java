import java.util.*;

class Solution {
    public Map<String,Integer> map = new HashMap<>();

    public String splitter(String s){
        int var1 = s.indexOf("{") + 1;
        int var2 = s.indexOf("}");
        String nums = s.substring(var1,var2);
        StringTokenizer tokenizer = new StringTokenizer(nums, ",");
        while (tokenizer.hasMoreTokens()) {
            String x = tokenizer.nextToken();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        if(var2 + 1 == s.length()) {
            return "";
        }
        int var3 = s.indexOf(nums)+nums.length();
        int var4 = s.indexOf(",",var3)+1;
        return s.substring(var4);
    }
    public int[] solution(String s) {
        s = s.substring(1,s.length()-1);
        while(!s.isEmpty()){
            s = splitter(s);
        }
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        int[] answer = new int[entryList.size()];
        for(int i = 0; i<entryList.size(); i++){
            answer[i] = Integer.parseInt(entryList.get(i).getKey());
        }
        return answer;
    }
}
