class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int len = pat.length();
        for(int i = 0; i <= myString.length()-len; i++){
            String substr = myString.substring(i, i + len);
            if(substr.equals(pat)){
                count++;
            }
        }
        return count;
    }
}