class Solution {
    public String solution(String s) {
       char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(cnt == 0 && arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] -= 32;
                cnt++;
            } else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] += 32;
            } else cnt++;
            if(arr[i] == ' '){
                cnt = 0;
            }
        }
        String sum = "";

        for(char c : arr){
            sum += c;
        }
       
       return sum;
    }
}