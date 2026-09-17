class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int product = 1;
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++){
            plus += num_list[i];
            product = product*num_list[i];
        }
        int plusSquare = plus * plus;
        answer = (product < plusSquare) ? 1 : 0;
        return answer;
    }
}