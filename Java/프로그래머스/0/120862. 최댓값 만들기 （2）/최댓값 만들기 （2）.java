import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        int big1 = numbers[n-1] * numbers[n-2];
        int big2 = numbers[0] * numbers[1];
        return Math.max(big1, big2);
    }
}