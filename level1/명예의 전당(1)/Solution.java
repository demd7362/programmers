import java.util.*;
class Solution {
    public static int[] getMinValues(int[] arr){
        int min = arr[0];
        int idx = 0;
        for(int i = 0; i<arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        return new int[]{idx,min};
    }
    public static int getMinValueOverZero(int[] arr){
        int min = arr[0];
        for(int x : arr){
            if(x != -1 && min > x){
                min = x;
            }
        }
        return min;
    }
    
    public List<Integer> solution(int k, int[] score) {
        int[] arr = new int[k];
        Arrays.fill(arr,-1); // score에 0값도 포함되어 있으므로 -1로 채움 -> 배열이 초기화될때 채워지는 0과 score에 들어있는 값 0을 구분할 수 없으므로
        List<Integer> list = new ArrayList<>();
        for(int s : score){
            int[] result = getMinValues(arr);
            int idx = result[0], min = result[1];
            if(s > min){ // score의 값이 arr의 최솟값보다 크다면
                arr[idx] = s; // arr의 최솟값을 s로 대체
                list.add(getMinValueOverZero(arr)); // arr의 최솟값을 구해서 list에 담음
            } else list.add(min); // score의 값이 arr의 최솟값보다 크다면 min(현재 arr에 있는 요소중의 최솟값)을 담음

        }
        return list;
    }
}
