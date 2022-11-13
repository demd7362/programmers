class Solution {

    public int[] answer(int one, int two, int three) {
        if (one > Math.max(two, three)) {
            return new int[] { 1 };
        }
        if (two > Math.max(one, three)) {
            return new int[] { 2 };
        }
        if (three > Math.max(one, two)) {
            return new int[] { 3 };
        }
        if (one == two && one > three) {
            return new int[] { 1, 2 };
        }
        if (one == three && one > two) {
            return new int[] { 1, 3 };
        }
        if (two == three && two > one) {
            return new int[] { 2, 3 };
        } else {
            return new int[] { 1, 2, 3 };
        }
    }

    public int[] solution(int[] answers) {
        int[] pattern_1 = { 1, 2, 3, 4, 5 };
        int[] pattern_2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] pattern_3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        int one = 0;
        int two = 0;
        int three = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern_1[i % pattern_1.length]) {
                one++;
            }
            if (answers[i] == pattern_2[i % pattern_2.length]) {
                two++;
            }
            if (answers[i] == pattern_3[i % pattern_3.length]) {
                three++;
            }
        }
        return answer(one, two, three);
    }
}
