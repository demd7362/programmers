class Solution {
    public int solution(String s) {
       StringBuilder sb = new StringBuilder(s);
        String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < arr.length; i++) {
            if (sb.indexOf(arr[i]) != -1) {
                sb.replace(sb.indexOf(arr[i]), sb.indexOf(arr[i]) + arr[i].length(), String.valueOf(i));
                i = -1;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
