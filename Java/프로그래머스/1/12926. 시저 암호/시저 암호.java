class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }
            if (ch >= 'a' && ch <= 'z') {
                char shifted = (char) (ch + n);
                if (shifted > 'z') {
                    shifted = (char) (shifted - 26);
                }
                answer.append(shifted);
            } 
            else if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char) (ch + n);
                if (shifted > 'Z') {
                    shifted = (char) (shifted - 26);
                }
                answer.append(shifted);
            }
        }
        return answer.toString();
    }
}
