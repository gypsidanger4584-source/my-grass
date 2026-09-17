class Solution {
    public int solution(String num_str) {
        int result = 0;
        for(int i = 0; i < num_str.length(); i++){
            char c = num_str.charAt(i);
            result += (c -'0');
        }
        return result;
        
    }
}