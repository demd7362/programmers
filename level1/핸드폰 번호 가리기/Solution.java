class Solution {
    public String solution(String phone_number) {
        String first = phone_number.substring(0, phone_number.length() - 4);
        String second = phone_number.substring(phone_number.length() - 4, phone_number.length());
        first = first.replaceAll("[0-9]", "*");
        return first + second;
    }
}
