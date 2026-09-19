import java.util.Arrays;
import java.util.ArrayList;
import java.util.StringTokenizer;
class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString,"x");
        ArrayList<String> list = new ArrayList<>();
        
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }
}