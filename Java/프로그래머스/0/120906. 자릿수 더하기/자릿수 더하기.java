import java.util.Arrays;
class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        return Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
    }
}