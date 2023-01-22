class Solution {
	public int[] solution(int n, int s) {
		int[] answer = new int[n];
		if (n > s) return new int[] { -1 };
		for (int i = 0; i < answer.length; i++, n--) {
			answer[i] = s / n;
			s -= answer[i];
		}
		return answer;
	}
}
