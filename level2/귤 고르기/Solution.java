import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }
        List<Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort(new Comparator<>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() == o2.getValue()) {
                    return 0;
                } else
                    return 1;
            }
        });
        int answer = 0;
        for (Entry<Integer, Integer> e : entry) {
            answer++;
            if (k > e.getValue()) {
                k -= e.getValue();
            } else
                break;
        }
        return answer;
    }
}
