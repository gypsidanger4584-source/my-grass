import java.util.ArrayList;
import java.util.StringTokenizer;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        ArrayList<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        return list.toArray(new String[0]);
    }
}