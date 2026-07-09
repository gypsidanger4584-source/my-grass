class Solution {
    public String[] solution(String my_str, int n) {
        int arrayLength = (my_str.length() + n -1)/n;
        String[] answer = new String[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            int start = i * n;
            int end = start + n;
            if(end > my_str.length()){
                end = my_str.length();
            }
            answer[i] = my_str.substring(start,end);
        }
        return answer;
    }
}