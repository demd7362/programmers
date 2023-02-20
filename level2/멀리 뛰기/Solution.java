class Solution {
    public long solution(int n) {
        if(n < 4) return n; // 칸이 총 3개까지는 효진이가 끝에 도달하는 방법은 칸의 갯수와 같다
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3; 
        for(int i=4; i<arr.length; i++) {   
            arr[i] = (arr[i-2]+arr[i-1])%1234567; // 단순하게 생각하면 쉬운 문제 => n이 10일 경우 [0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]...
        }
        return arr[n]; 
        // int[] arr = new int[n] 으로 초기화하고 return (arr[n-2]+arr[n-1])%1234567 와 같다
      
    }
}
