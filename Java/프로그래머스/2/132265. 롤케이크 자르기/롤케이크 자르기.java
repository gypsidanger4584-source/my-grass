import java.util.*;
class Solution {
    public int solution(int[] topping) {
        
        int answer = 0;
        
        HashMap<Integer, Integer> leftMap = new HashMap<>();
        HashMap<Integer, Integer> rightMap = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++){
            rightMap.put(topping[i],rightMap.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length - 1; i++){
            leftMap.put(topping[i],leftMap.getOrDefault(topping[i] , 0) + 1);
            rightMap.put(topping[i],rightMap.get(topping[i]) - 1);
            
            if(rightMap.get(topping[i]) == 0){
                rightMap.remove(topping[i]);
            }
            if(leftMap.size() == rightMap.size()){
                answer++;
            }
        }
        return answer;
    }
}