import java.util.*;
import java.util.Map.Entry;
class Game {
    private int round;
    private double failedRate;
    public Game(int round, double failedRate) {
        this.round = round;
        this.failedRate = failedRate;
    }
    public int getRound() {
        return round;
    }
    public double getFailedRate() {
        return failedRate;
    }
}
class Solution {
    public List<Integer> solution(int N, int[] stages) {
        Map<Integer,Integer> failedMap = new HashMap<>();
        for(int stage : stages) {
            failedMap.put(stage, failedMap.getOrDefault(stage, 0)+1);
        }
        List<Game> list = new ArrayList<>();
        for(int i=1; i<N+1; i++) {
            int tmp = i;
            long reached = Arrays.stream(stages).filter((x)-> x >= tmp).count();
            int failed = failedMap.getOrDefault(i, 0);
            list.add(new Game(i,failed/(double)reached));
        }
        Collections.sort(list,new Comparator<Game>() {
            @Override
            public int compare(Game o1, Game o2) {
                if(o1.getFailedRate() < o2.getFailedRate()) {
                    return 1;
                } else if(o1.getFailedRate() > o2.getFailedRate()) {
                    return -1;
                } else return 0;
            }   
        });

        List<Integer> answer = new ArrayList<>();
        for(Game game : list) {
            answer.add(game.getRound());
        }
        return answer;
    }
}
