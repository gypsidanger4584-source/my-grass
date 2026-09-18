class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for(String s : my_string.split("")){
            sb.append(s.equals(alp) ? s.toUpperCase() : s);
        }
        return sb.toString();
    }
}