import java.util.Collections;
import java.util.HashMap;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(String str : strArr){
            int len = str.length();
            map.put(len,map.getOrDefault(len,0)+1);
                }
        return Collections.max(map.values());
            }
        }