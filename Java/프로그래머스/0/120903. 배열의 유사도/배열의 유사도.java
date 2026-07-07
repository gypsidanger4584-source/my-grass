import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<>(Arrays.asList(s1));
        for(String str : s2){
            if(set.contains(str)){
                answer++;
            }
        }
        return answer;
    }
}