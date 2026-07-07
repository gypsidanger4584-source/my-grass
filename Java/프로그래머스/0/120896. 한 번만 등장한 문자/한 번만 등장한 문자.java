import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Character> sc = new ArrayList<>();
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                sc.add(ch);
            }
        }
        Collections.sort(sc);
        
        StringBuilder sb = new StringBuilder();
        for (char ch : sc) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}
