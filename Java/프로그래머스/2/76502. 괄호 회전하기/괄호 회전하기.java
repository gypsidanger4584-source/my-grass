import java.util.*;

class Solution {
    public int solution(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++) {

            if(check(s)) {
                count++;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(1));
            sb.append(s.charAt(0));

            s = sb.toString();
        }

        return count;
    }

    public boolean check(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if(st.isEmpty()) {
                    return false;
                }

                if(c == ')' && st.peek() == '(') {
                    st.pop();
                } else if(c == ']' && st.peek() == '[') {
                    st.pop();
                } else if(c == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}