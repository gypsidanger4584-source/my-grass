import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        HashMap<String,Integer> wantMap = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i],number[i]);
        }
        
        for(int i = 0; i < 10; i++){
            map.put(discount[i],map.getOrDefault(discount[i],0)+1);
        }
        if(wantMap.equals(map)){
            count++;
        }
        
        for(int i = 10; i < discount.length; i++){
            String removeItem = discount[i-10];
            String addItem = discount[i];
            
            if(map.get(removeItem) == 1){
                map.remove(removeItem);
            }else{
                map.put(removeItem,map.get(removeItem)-1);
            }
            
            map.put(addItem,map.getOrDefault(addItem,0)+1);
            
            if(wantMap.equals(map)){
                count++;
            }
        }
        return count;
    }
}