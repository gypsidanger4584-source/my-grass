class Solution {
    public String solution(int age) {
        String answer = "";
        char arr[] = "abcdefghij".toCharArray();
        String agestr = String.valueOf(age);
        
        for(int i = 0; i < agestr.length(); i++){
            answer += arr[agestr.charAt(i)-'0'];
        }        
        return answer;
    }
}