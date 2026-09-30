class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int result = 0;
        for(int i = 0; i < schedules.length; i++){
            int limit = (schedules[i]/100)*60+schedules[i]%100+10;
            boolean success = true;
            
            for(int j = 0; j < 7; j++){
                int day = (startday + j - 1)%7+1;
                
                if(day == 6 || day == 7){
                    continue;
                }
                int actual = (timelogs[i][j]/100)*60+timelogs[i][j]%100;
                
                if(actual>limit){
                    success = false;
                    break;
                }
            }
            if(success){
                result++;
            }
        }
        return result;
    }
}