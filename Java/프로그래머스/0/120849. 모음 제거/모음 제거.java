class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] m = new char[]{'a','e','i','o','u'};
    OUTER :
        for(int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            for(int j = 0; j < m.length; j++){
                if(ch == m[j]){
                    continue OUTER;
                }
            }
            answer += ch;
        }
        return answer;
    }
}