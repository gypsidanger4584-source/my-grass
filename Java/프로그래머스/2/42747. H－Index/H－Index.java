class Solution {
    public int solution(int[] citations) {
        
        int answer = 0;
        
        for(int h = 0; h <= citations.length; h++){
            int count = 0;
            
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= h){
                    count++;
                }
            }
            if(count >= h){
                answer = h;
            }
        }
        return answer;
    }
}