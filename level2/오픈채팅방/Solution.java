import java.util.*;
class Solution {
    public List<String> solution(String[] record) {
        Map<String,String> map = new HashMap<>(); // K = id, V = nickname
        List<String> answer = new ArrayList<>();
        for(int i=0; i<record.length; i++) {
            String[] split = record[i].split(" ");
            String id = split[1];
            String nickname = split.length == 2 ? map.get(id) : split[2]; // 길이가 2라면 닉네임 변경 => 이미 map에 id가 있음

            switch(split[0]) {
            case "Enter": 
                map.put(id, nickname);
                answer.add("$"+id);
                break;
            case "Leave":
                answer.add(id+"$");
                break;
            case "Change":
                map.put(id, nickname);
                break;
            }

        }
        for(int i=0; i<answer.size(); i++) {
            String id = answer.get(i);
            int idx = id.indexOf("$");
            id = id.replace("$", "");
            switch(idx) {
            case 0 : 
                answer.set(i, map.get(id)+"님이 들어왔습니다.");
                break;
            case -1 :
                continue;
            default :
                answer.set(i, map.get(id)+"님이 나갔습니다."); 
            }
        }

        return answer;
    }
}
