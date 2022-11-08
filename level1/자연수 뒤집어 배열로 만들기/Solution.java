class Solution { // 12345 -> [5,4,3,2,1]
    public int[] solution(long n) {
        String str = String.valueOf(n); // n으로 들어오는값을 String으로
        char[] arr = str.toCharArray(); // String을 쪼개서 char arr에 담는다
        int[] answer = new int[arr.length]; // answer 배열 생성
        for (int i = 0; i < arr.length; i++) {
            answer[arr.length - i - 1] = arr[i] - '0';
        }
        return answer;
    }
}
