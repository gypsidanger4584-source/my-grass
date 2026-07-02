class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length/n;
        int columns = n;
        int[][] answer = new int[rows][columns];
        
        for(int i = 0; i < num_list.length; i++){
            int r = i/columns;
            int c = i%columns;
            answer[r][c] = num_list[i];
        }
        
        return answer;
    }
}