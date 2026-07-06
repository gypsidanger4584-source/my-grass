class Solution {
    public String solution(String s) {
        return s.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}