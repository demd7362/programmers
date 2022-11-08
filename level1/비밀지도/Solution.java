class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        StringBuilder sb = new StringBuilder();
        String radix = "";
        String[] tmpArr1 = new String[n];
        String[] tmpArr2 = new String[n];
        String[] trueArr = new String[n];
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i : arr1) {
            radix = Integer.toBinaryString(i);
            sb.append(radix);
            for (int j = 0; j < n; j++) {
                if (sb.length() < n)
                    sb.insert(0, "0");
            }
            tmpArr1[cnt1] = sb.toString();
            sb.setLength(0);
            cnt1++;
        }
        for (int i : arr2) {
            radix = Integer.toBinaryString(i);
            sb.append(radix);
            for (int j = 0; j < n; j++) {
                if (sb.length() < n)
                    sb.insert(0, "0");
            }

            tmpArr2[cnt2] = sb.toString();
            sb.setLength(0);
            cnt2++;
        }
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if (tmpArr1[i].charAt(j) == '1' || tmpArr2[i].charAt(j) == '1') {
                    s += "#";
                } else
                    s += " ";
            }
            trueArr[i] = s;
        }
        return trueArr;
    }
}
