import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        
        for(int i = 1; i < n; i++){
            if(n%i==1){
                div.add(i);
            }
        }
        Collections.sort(div);
        return div.get(0);
    }
}