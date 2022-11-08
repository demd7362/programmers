class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        for (String s : seoul) {
            if (s.equals("Kim")) {
                break;
            } else
                index++;
        }
        return "김서방은 " + index + "에 있다";
    }
}
