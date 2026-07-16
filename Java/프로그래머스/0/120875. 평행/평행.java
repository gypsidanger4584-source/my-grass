class Solution {
    public int solution(int[][] dots) {
        int[][] cases = {{1, 2, 3}, {2, 1, 3}, {3, 1, 2}};
        
        for (int[] c : cases) {
            int dy1 = dots[c[0]][1] - dots[0][1];
            int dx1 = dots[c[0]][0] - dots[0][0];
            int dy2 = dots[c[2]][1] - dots[c[1]][1];
            int dx2 = dots[c[2]][0] - dots[c[1]][0];
            
            if (dy1 * dx2 == dy2 * dx1) return 1;
        }
        
        return 0;
    }
}