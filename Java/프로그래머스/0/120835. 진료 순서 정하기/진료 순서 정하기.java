class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++){
            int currentRank = 1;
            
            for(int j = 0; j < emergency.length; j++){
                if(emergency[j] > emergency[i]){
                    currentRank ++;
                }
            }
            answer[i] = currentRank;
        }
        return answer;
    }
}