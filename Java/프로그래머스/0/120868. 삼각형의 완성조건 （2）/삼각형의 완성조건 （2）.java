import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int small = sides[0];
        int big = sides[1];
        
        for(int i = big + 1; i < big + small; i++){
            answer++;
        }
        for(int i = big - small + 1; i <= big; i++){
            answer++;
        }
        
        return answer;
    }
}