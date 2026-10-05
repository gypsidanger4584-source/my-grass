import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Character,Integer> map = new HashMap<>();
        List<Character> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(char x : X.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(char y : Y.toCharArray()){
            if(map.containsKey(y) && map.get(y) >= 1){
                map.put(y,map.get(y)-1);
                result.add(y);
            }
        }
        result.sort(Collections.reverseOrder());
        if(result.isEmpty()){
            return "-1";
        }
        for(char c : result){
            sb.append(c);
        }
        if(sb.charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}