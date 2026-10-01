class Solution {
    public int solution(int number, int limit, int power) {
        int total = 0;
        for(int i = 1; i <= number; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count > limit){
                total += power;
            }else{
                total += count;
            }
        }
        return total;
    }
}