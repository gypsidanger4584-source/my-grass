import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < words.length; i++){
            if(!set.add(words[i])){
                
                int number = (i % n) + 1;
                int circle = (i / n) + 1;
                
                return new int[]{number,circle};
            }
            if(i > 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                int number = (i % n) + 1;
                int circle = (i / n) + 1;
                
                return new int[]{number,circle};
            }
        }
        return new int[]{0,0};
    }
}