class Solution {
    public int solution(int balls, int share) {
           if (share > balls - share) {
            share = balls - share;
        }
        long answer = 1;
        for (int i = 1; i <= share; i++) {
            answer *= (balls - i + 1); 
            answer /= i;
        }          
        return (int) answer;
    }
}
