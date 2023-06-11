import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int boxCnt = score.length / m; // 박스가 몇개 나오는가
        List<List<Integer>> boxes = new ArrayList<>();

        for (int i = score.length - 1; boxes.size() < boxCnt; i -= m) { 
            List<Integer> box = new ArrayList<>();
            for (int j = i; j > i-m; j--) { 
                box.add(score[j]);
            }
            boxes.add(box);
        }

        return boxes.stream()
        .mapToInt(box -> box.stream().min(Integer::compareTo).orElse(0) * box.size())
        .sum();
    }
}
