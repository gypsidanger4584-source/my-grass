import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> scoreMap = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            scoreMap.put(name[i],yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            int totalScore = 0;
            for(String person : photo[i]){
                totalScore += scoreMap.getOrDefault(person,0);
            }
            answer[i] = totalScore;
        }
        return answer;
    }
}