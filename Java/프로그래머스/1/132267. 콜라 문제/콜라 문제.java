class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int newCoke = (n/a)*b;
            int remain = n % a;
            answer += newCoke;
            n = remain + newCoke;   
        }
        return answer;
    }
}