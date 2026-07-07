import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public long solution(String numbers) {
        Map<String, String> map = Map.of(
            "zero", "0", "one", "1", "two", "2", "three", "3", "four", "4",
            "five", "5", "six", "6", "seven", "7", "eight", "8", "nine", "9"
        );
        Pattern pattern = Pattern.compile(String.join("|", map.keySet()));
        Matcher matcher = pattern.matcher(numbers);
        StringBuffer sb = new StringBuffer(); 
        while(matcher.find()){
            matcher.appendReplacement(sb, map.get(matcher.group()));
        }
        
        return Long.parseLong(sb.toString());
    }
}
