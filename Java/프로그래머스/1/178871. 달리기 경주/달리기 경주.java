import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i],i);
        }
        for(String call : callings){
            int callIndex = map.get(call);
            String prev = players[callIndex-1];
            
            String temp = players[callIndex];
            players[callIndex] = players[callIndex - 1];
            players[callIndex - 1] = temp;
            
            map.put(prev,callIndex);
            map.put(call,callIndex-1);
        }
        return players;
    }
}