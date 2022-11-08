class Solution {
    public int solution(int n) {
        int namuji = n % 3;
        int moks = n / 3;
        String str = "";
        int sum = 0;
        while (true) {
            str += namuji;
            if (moks < 1)
                break;
            namuji = moks % 3;
            moks /= 3;
        }
        char[] arr = str.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            sum += (Character.getNumericValue(arr[i]) * Math.pow(3, j));
            j--;
        }
        return sum;
    }
}
