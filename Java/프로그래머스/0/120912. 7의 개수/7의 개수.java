import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        String str = Arrays.toString(array).replaceAll("[^7]","");
        return str.length();
    }
}