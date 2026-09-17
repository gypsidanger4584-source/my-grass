class Solution {
    public int solution(int a, int b) {
        int t1 = Integer.parseInt(""+a+b);
        int t2 = 2*a*b;
        
        return Math.max(t1,t2);
    }
}