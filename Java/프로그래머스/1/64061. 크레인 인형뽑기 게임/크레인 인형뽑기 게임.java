import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int move : moves){
            int column = move-1;
            
            for(int i = 0; i < board.length; i++){
                if(board[i][column] != 0){
                    int doll = board[i][column];
                    board[i][column] = 0;
                    
                    if(stack.isEmpty() || stack.peek() != doll){
                        stack.push(doll);
                    }else{
                        stack.pop();
                        answer+=2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}