class Solution {
    
    int timeToSec(String time){
        String[] arr = time.split(":");
        int min = Integer.parseInt(arr[0]);
        int sec = Integer.parseInt(arr[1]);
        return min*60+sec;
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int current = timeToSec(pos);
        int video = timeToSec(video_len);
        int op = timeToSec(op_start);
        int end = timeToSec(op_end);
        
        if(current >= op && current <= end){
            current = end;
        }
        for(String com : commands){
            if(com.equals("next")){
                current += 10;
                
                if(current >= video){
                    current = video;
                }
                
            }else if(com.equals("prev")){
                current -= 10;
                
                if(current < 0){
                    current = 0;
                }
            }
            if(current >= op && current <= end){
                current = end;
            }
        }
        int min = current / 60;
        int sec = current % 60;
        return String.format("%02d:%02d",min,sec);
        
        
    }
}