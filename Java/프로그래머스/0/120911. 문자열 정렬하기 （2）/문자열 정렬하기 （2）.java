import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String lowerStr = my_string.toLowerCase();
        char[] charArray = lowerStr.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}