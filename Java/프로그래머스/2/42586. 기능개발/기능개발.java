import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int maxDay = 0;
        int count = 0;
        
        for(int i = 0; i < progresses.length; i++){
            int day = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            
            if(day > maxDay){
                
                if(count > 0){
                    list.add(count);
                }
                maxDay = day;
                count = 1;
            }else{
                count++;
            }  
        }
        list.add(count);
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}