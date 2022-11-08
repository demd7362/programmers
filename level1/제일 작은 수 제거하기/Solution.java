import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (a < min)
                min = a;
        }
        ArrayList<Integer> al = new ArrayList<>();
        if (arr.length == 1)
            al.add(-1);
        for (int element : arr) {

            if (element != min)
                al.add(element);
        }
        int[] answer = al.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
