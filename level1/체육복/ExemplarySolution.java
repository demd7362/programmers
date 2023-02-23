class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] people = new int[n]; // 0 0 0 0 0 번호대로 줄 세우기 위한 배열
        int answer = n;

        for (int l : lost) 
            people[l-1]--; // 체육복이 없는 학생의 번호 -1
        for (int r : reserve) 
            people[r-1]++; // 체육복 여분이 있는 학생의 번호 +1, 0이라면 여분은 없으나 본인의 체육복은 가지고 있음

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) { // 체육복이 없음
                if(i - 1 >= 0 && people[i-1] == 1) { // 내 앞에 사람 체육복 여분 있음
                	// 앞에 조건을 달아줌으로써 익셉션을 방지
                    people[i]++; // 체육복 빌린다
                    people[i-1]--; // 앞에 사람 0으로 만듦
                }else if(i+1< people.length && people[i+1] == 1) { // 내 뒤에 사람 체육복 여분 있음
                    people[i]++; // 체육복 빌린다
                    people[i+1]--; // 뒤에 사람 0으로 만듦
                }else  // 빌릴 방법이 없음
                    answer--;
            }
        }
        return answer;
	}
}
