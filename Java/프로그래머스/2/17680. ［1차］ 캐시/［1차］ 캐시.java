import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        ArrayList<String> cache = new ArrayList<>();
        
            int runtime = 0;
        
            for(int i = 0; i < cities.length; i++){
                String city = cities[i].toLowerCase();
                
                if(cacheSize == 0){
                    return cities.length * 5;
                }
                
                if(cache.contains(city)){
                    runtime += 1;
                    cache.remove(city);
                    cache.add(city);
                }else{
                    runtime += 5;
                    if(cache.size() == cacheSize){
                        cache.remove(0);
                    }
                    cache.add(city);
                }
            }
        return runtime;
    }
}