import java.util.HashSet;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        HashSet<Integer> win = new HashSet<>();
        int zeroCount = 0;
        int matchCount = 0;

        for(int winlist : win_nums){
            win.add(winlist);
        }
        for(int lotto : lottos){
            if(lotto == 0){
                zeroCount++;
            }else if(win.contains(lotto)){
                matchCount++;
            }
        }
        int best = matchCount + zeroCount;
        int worst = matchCount;
        
        int[] rank = {6,6,5,4,3,2,1};
        return new int[] {rank[best],rank[worst]};
    }
}