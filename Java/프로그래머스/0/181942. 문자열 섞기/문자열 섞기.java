import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public String solution(String str1, String str2) {
        return IntStream.range(0,str1.length())
            .mapToObj(i -> ""+str1.charAt(i)+str2.charAt(i))
            .collect(Collectors.joining());
    }
}