class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String number = my_string.replaceAll("[A-Za-z]","");
        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            answer += (ch-48);
            
        }
        return answer;
    }
}