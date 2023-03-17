class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya","ye","woo","ma"};
		int cnt = 0;
		loop:
		for(int i=0; i<babbling.length; i++) {
			for(String word : words) {
				if(babbling[i].indexOf(word+word) != -1) { // 연속해서 발음하는걸 어려워하기 때문에 => 할줄 아는 단어 2개 이상이 조합되면 건너뜀
					continue loop;
				}
				babbling[i] = babbling[i].replace(word, "!"); // 발음 2개이상이 조합되지 않았다면 구분자로 쓸 임의의 단어로 치환
			}
			babbling[i] = babbling[i].replace("!", ""); // 구분자로 쓴 단어를 공백으로 하고
			if(babbling[i].isEmpty()) cnt++; // 문자열이 비어있다면 발음할 수 있는 단어의 갯수 1증가
		}
        return cnt;
    }
}
