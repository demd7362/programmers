import java.util.*;
class Solution {
    public int solution(String s) {
        
		int answer = 0;
		for(int i=0; i<s.length(); i++) {
			String tmp = s.substring(i)+s.substring(0,i);
			int cnt = 0;
			char[] chars = tmp.toCharArray();
			Stack<Character> stack = new Stack<>();
			for(char c : chars) {
				if(stack.isEmpty()) {
					stack.push(c);
				} else {
					switch(stack.peek()) {
					case '(' : 
						if(c == ')') {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					case '{' :
						if(c == '}') {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					case '[' :
						if(c == ']') {
							stack.pop();
						} else {
							stack.push(c);
						}
						break;
					} // end of switch
				}
			}
			if(stack.isEmpty()) answer++;
		}
        return answer;
    }
}
