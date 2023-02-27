import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book,(o1,o2)-> o1.compareTo(o2)); // 문자열이 포함되어있느냐를 기준으로 오름차순 정렬
		for(int i=1; i<phone_book.length; i++) {
			if(phone_book[i].startsWith(phone_book[i-1])) {
				return false;
			}
		}
        return true;
    }
}
