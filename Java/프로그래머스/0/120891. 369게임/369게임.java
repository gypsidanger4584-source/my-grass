class Solution {
    public int solution(int order) {
        int answer = 0;
        String strorder = Integer.toString(order);
        for(int i = 0; i < strorder.length(); i++){
            char ch = strorder.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        return answer;
    }
}