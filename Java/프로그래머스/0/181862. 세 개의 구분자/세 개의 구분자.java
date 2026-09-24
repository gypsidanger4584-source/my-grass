import java.util.ArrayList;
import java.util.StringTokenizer;
class Solution {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr,"abc");
        ArrayList<String> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        if(list.isEmpty()){
            return new String[]{"EMPTY"};
        }
    return list.toArray(String[]::new);
    }
}