import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        
        queue.offer(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            
            int x = current[0];
            int y = current[1];
            int dist = current[2];
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nextDist = dist + 1;
                
                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length){
                    if(maps[nx][ny] == 1 && visited[nx][ny] == false){
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny,nextDist});
                        
                        if(nx == maps.length - 1 && ny == maps[0].length - 1){
                            return nextDist;
                        }
                    }
                }
            }
        }
        return -1;
    }
}