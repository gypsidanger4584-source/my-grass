class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int w1 = Math.min(wallet[0],wallet[1]);
        int w2 = Math.max(wallet[0],wallet[1]);
        int b1 = bill[0];
        int b2 = bill[1];
        while(Math.min(b1,b2) > w1 || Math.max(b1,b2) > w2){
            if(b1 > b2){
                b1 /= 2;
            }else{
                b2/=2;
            }
            answer++;
        }
        return answer;
    }
}