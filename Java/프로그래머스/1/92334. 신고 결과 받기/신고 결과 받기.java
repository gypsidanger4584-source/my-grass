import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> id = new HashSet<>();
        for(String r : report){
            id.add(r);
        }
        Map<String,Integer> count = new HashMap<>();
        for(String r : id){
            String[] names = r.split(" ");
            count.put(names[1], count.getOrDefault(names[1],0)+1);
        }
        Map<String,Integer> mail = new HashMap<>();
        for(String r : id){
            String[] names = r.split(" ");
            String reporter = names[0];
            String reported = names[1];
            
            if(count.getOrDefault(reported,0) >= k){
                mail.put(reporter,mail.getOrDefault(reporter,0) + 1);
            }
        }
        int[] answer = new int[id_list.length];
        for(int i = 0; i < id_list.length; i++){
            answer[i] = mail.getOrDefault(id_list[i],0);
        }
        return answer;
    }
}