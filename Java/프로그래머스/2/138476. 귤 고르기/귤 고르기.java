import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int value : map.values()){
            list.add(value);
        }
        
        Collections.sort(list,Collections.reverseOrder());
        for(int value:list){
            sum+=value;
            count++;
            
            if(sum >= k){
                return count;
            }
        }
        return count;
    }
}