class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char tg = letter.charAt(0);
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++){
            answer += (arr[i] == tg) ? "" : arr[i];
        }
        return answer;
    }
}