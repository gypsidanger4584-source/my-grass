class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int div = (2*(k-1)) % numbers.length;
        return numbers[div];
    }
}