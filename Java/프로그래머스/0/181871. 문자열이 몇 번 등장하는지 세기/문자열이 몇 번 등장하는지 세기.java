import java.util.stream.IntStream;
class Solution {
    public int solution(String myString, String pat) {
        int len = pat.length();
        return (int)IntStream.rangeClosed(0,myString.length()-len)
            .mapToObj(i -> myString.substring(i,i+len))
            .filter(substr -> substr.equals(pat))
            .count();
    }
}