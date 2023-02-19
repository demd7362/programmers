import java.util.*;
class Solution {
    public int solution(String dirs) {
        char[] chars = dirs.toCharArray();
		List<String> list = new ArrayList<>(); 
		int x = 0;
		int y = 0;
		int cnt = 0;
		String current = "0,0";
		for(char c : chars) {
			switch(c) {
			case 'U' : if(y>=5){
                continue;
            } else y++;
			break;
			case 'D' : if(y<=-5){
                continue;
            } else y--;
			break;
			case 'L' : if(x<=-5){
                continue;
            } else x--;
			break;
			case 'R' : if(x>=5){
                continue;
            } else x++;
			break;
			}
      // 변수명을 position으로 짓기보다는 next 또는 target이 나았을 것 같다
			String position = current+"@"+x+","+y; // @을 기준으로 왼쪽이 현재 좌표, 오른쪽이 이동한 좌표
			String reverse = position.split("@")[1]+"@"+position.split("@")[0]; // 왼쪽과 오른쪽의 좌푯값이 바뀐 값을 reverse에 담는다
			current = x+","+y; // 이동해서 지금 위치한 좌푯값을 current에 담는다
			if(!(list.contains(position) || list.contains(reverse))) { // 왼쪽과 오른쪽의 좌푯값이 바뀌어도 지나온 길은 같기때문에 
				cnt++;
				list.add(position);
			} 
		}
        return cnt;
    }
}
