class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n,3);
        String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();
        answer = Integer.parseInt(reversedStr,3);
        return answer;
    }
}