import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sumed= new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!sumed.contains(sum)){
                    sumed.add(sum);
                }
            }
        }
        Collections.sort(sumed);
        int[] answer = new int[sumed.size()];
        for(int i = 0; i < sumed.size(); i++){
            answer[i] = sumed.get(i);
        }
        return answer;
    }
}