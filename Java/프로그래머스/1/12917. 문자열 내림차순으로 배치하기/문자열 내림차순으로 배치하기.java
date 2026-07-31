import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String reverseStr = new StringBuilder(new String(charArr)).reverse().toString();
        return reverseStr;
    }
}