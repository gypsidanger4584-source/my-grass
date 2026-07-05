import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch >= 48 && ch <= 57){
                answer = Arrays.copyOf(answer,answer.length+1);
                answer[answer.length-1] = ch - 48;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}