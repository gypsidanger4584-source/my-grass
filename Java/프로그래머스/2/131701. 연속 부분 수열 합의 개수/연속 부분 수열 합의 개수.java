import java.util.*;
class Solution {
    public int solution(int[] elements) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int start = 0; start < elements.length; start++){
            int sum = 0;
            
            for(int j = 0; j < elements.length; j++){
                int index = (start + j) % elements.length;
                sum += elements[index];
                set.add(sum);
            }
        }
        return set.size();
    }
}