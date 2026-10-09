import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        
        int boxCount = score.length/m;
        
        for(int i = 0; i < boxCount; i++){
            int index = score.length - m*(i+1);
            answer += sorted[index] * m;
        }
        return answer;
    }
}