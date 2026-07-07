class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        char tgk = (char)(k+'0');
     
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == tgk) {
                return i + 1;
            }
        }
        return -1;
    }
}