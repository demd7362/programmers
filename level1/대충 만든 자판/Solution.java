class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i<targets.length; i++) {
            int sum = -1;
            for(char c : targets[i].toCharArray()) {
                int idx = 100; // keymap의 요소의 최대 길이 100, 최대 index 위치 99
                for(String key : keymap) {
                    int tmp = key.indexOf(c) + 1; // 몇 번 눌러야 하는지를 물어봤으므로 인덱스 위치에서 +1
                    if(tmp > 0) idx = Math.min(idx, tmp); // c에 해당하는 인덱스가 없다면 -1 반환하고 +1 되니 값을 찾을 수 없다면 tmp는 0
                }   
                sum += idx != 100? idx : 0; // keymap의 요소 중에서 c값을 한번도 찾을 수 없다면 idx == 100 
            }
            answer[i] = sum == -1? sum : sum + 1; // targets의 요소 전체 문장 중 c값을 단 한번도 찾을 수 없었다면 sum == -1
        }
        return answer;

    }
}
