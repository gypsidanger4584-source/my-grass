class Solution {
    public int solution(String s) {
        int i = 0;
        int answer = 0;
        
        while(i < s.length()){
            int same = 0;
            int diff = 0;
            char x = s.charAt(i);
            
            while(i < s.length()){
                if(x == s.charAt(i)){
                    same++;
                }else{
                    diff++;
                }
                i++;
                if(same == diff){
                    answer++;
                    break;
                }
            }
            if(i == s.length() && same != diff){
                answer++;
            }
        }
        return answer;
    }
}