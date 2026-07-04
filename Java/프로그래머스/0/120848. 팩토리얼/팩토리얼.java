class Solution {
    public int solution(int n) {
        int x = 1;
        while(n >= x){
            n /= x;
            x++;
        }
        return x-1;
    }
}