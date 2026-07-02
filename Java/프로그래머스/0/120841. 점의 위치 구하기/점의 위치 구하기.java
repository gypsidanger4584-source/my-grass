class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int dot1 = dot[0];
        int dot2 = dot[1];
        if(dot1 > 0 && dot2 > 0){
            answer = 1;
        }else if(dot1 < 0 && dot2 > 0){
            answer = 2;
        }else if(dot1 < 0 && dot2 < 0){
            answer = 3;
        }else if(dot1 > 0 && dot2 < 0){
            answer = 4;
        }
        return answer;
    }
}