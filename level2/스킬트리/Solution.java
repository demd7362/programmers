import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        String[] chars = skill.split("");
        int answer = 0;
        for(String tree : skill_trees) { 
            boolean isWrong = false; 
            Queue<String> queue = new LinkedList<>(Arrays.asList(chars)); // skill을 쪼개서 queue에 담는다
            for(String target : tree.split("")) { // 스킬트리를 담은 배열에서 스킬트리를 분리하고, 스킬트리에서 스킬을 분리
                if(queue.contains(target)) { // 타겟 스킬이 queue에 있다면
                    if(queue.peek().equals(target)) { // queue에서 다음 스킬을 가져오고 target과 일치한다면 꺼낸다
                        queue.poll();
                    } else { // 일치하지 않는다면 틀린 스킬트리
                        isWrong = true;
                        break;
                    } 
                } 
            } 
            if(!isWrong) answer++;
        }
        return answer;
    }
}
