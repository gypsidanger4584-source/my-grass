class Solution {
    public int solution(int n, int w, int num) {
        int row = (num-1)/w;
        int col = (num-1)%w;
        if(row % 2 ==1){
            col = w -1 -col;
        }
        int answer = 0;
        for(int i = row; i <= (n-1)/w; i++){
            int index;
            if(i%2==0){
                index = col;
            }else{
                index = w -1 -col;
            }
            int boxNum = i*w+index+1;
            if(boxNum <= n){
                answer++;
            }
        }
        return answer;
    }
}