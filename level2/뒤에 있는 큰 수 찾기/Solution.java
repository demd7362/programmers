import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1); // 배열을 만들고 -1로 초기화
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // i를 1로 시작하고 0을 스택에 미리 담음
        for(int i = 1; i<numbers.length; i++) {
            if(numbers[i-1] > numbers[i]) { // 현재 idx가 뒷 큰수에 해당하지 않는다면
                stack.push(i); // 스택에 담은 수와 비교해야 하기 때문에
            } else { // 현재 i가 뒷 큰수에 해당한다면 바로 스택에 담지 않고 
                while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) { // 마지막으로 스택에 담은 수에 대하여 현재 idx가 뒷 큰수에 해당하는가
                    answer[stack.pop()] = numbers[i]; // 해당한다면 스택에서 꺼낸다. 그리고 그 idx의 값은 현재 idx
                }
                stack.push(i); // 현재 idx를 스택에 담는다
            }
        }
        return answer;
    }
}
