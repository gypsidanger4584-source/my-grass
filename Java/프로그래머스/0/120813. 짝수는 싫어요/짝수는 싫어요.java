class Solution {
    public int[] solution(int n) {
        int size = (n+1)/2;
        int[] answer = new int[size];
        
        int index = 0;
        for (int i = 0; i <= n; i++){
            if(i % 2 == 1){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}