class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] antATK = {5,3,1};
            for(int temp : antATK){
                answer += hp / temp;
                hp = hp % temp;
            }
        return answer;
    }
}