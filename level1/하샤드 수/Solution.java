class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String[] arr = String.valueOf(x).split("");
        for (String str : arr) {
            sum += Integer.parseInt(str);
        }
        if (x % sum == 0) {
            return true;
        } else
            return false;
    }
}
