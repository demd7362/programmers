class Solution {
    public String solution(String s, int n) {
        String str = "";
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c != ' ')
                c += n;
            if ((c - n) > 96 & (c - n) < 123 & c > 122)
                c -= 26;

            else if ((c - n) > 64 & (c - n) < 91 & c > 90)
                c -= 26;
            str += c;
        } // end of for
        return str;
    }
}
