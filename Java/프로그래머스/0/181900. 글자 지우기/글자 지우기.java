class Solution {
    public String solution(String my_string, int[] indices) {
        String[] string = my_string.split("");
        for(int idx : indices){
            string[idx] = "";
        }
        return String.join("",string);
    }
}