import java.util.HashMap;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int crtX = 0;
        int crtY = 0;
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        HashMap<String, int[]> moveMap = new HashMap<>();
        moveMap.put("up",new int[]{0,1});
        moveMap.put("down",new int[]{0,-1});
        moveMap.put("right",new int[]{1,0});
        moveMap.put("left",new int[]{-1,0});
        
        for(String key : keyinput){
            int[] move = moveMap.get(key);
        
        int nextX = crtX + move[0];
        int nextY = crtY + move[1];
        if (nextX >= -maxX && nextX <= maxX) {
            crtX = nextX;
            }
        if (nextY >= -maxY && nextY <= maxY) {
            crtY = nextY;
        }
    }
        return new int[]{crtX, crtY};
    }
}