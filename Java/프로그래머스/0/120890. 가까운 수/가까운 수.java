import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        for(int i = 1; i < array.length; i++){
            if(Math.abs(array[i]-n) < Math.abs(answer-n)){
                answer = array[i];
            }
        }
        return answer;
    }
}