class Solution {
    public int solution(int n) {
        double root = Math.sqrt(n);
        if((int)root*(int)root == n) {
            return 1;
        }else{
            return 2;
        }
    }
}