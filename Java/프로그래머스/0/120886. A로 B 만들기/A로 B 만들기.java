import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] charArr1 = before.toCharArray();
        char[] charArr2 = after.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        
        return Arrays.equals(charArr1,charArr2) ? 1 : 0;
        
    }
}