class Solution {
    public int solution(int n) {
        String bin1 = Integer.toBinaryString(n);
        int cnt1 = 0;
        for (int i = 0; i < bin1.length(); i++) {
            if (bin1.charAt(i) == '1')
                cnt1++;
        }
        for (int i = n + 1; true; i++) {
            String bin2 = Integer.toBinaryString(i);
            int cnt2 = 0;
            for (int j = 0; j < bin2.length(); j++) {
                if (bin2.charAt(j) == '1')
                    cnt2++;
            }
            if (cnt1 == cnt2)
                return i;
        }
    }
}
