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
        int opstart = timeToSec(op_start);
        int opend = timeToSec(op_end);
        
        if(current >= opstart && current <= opend){
            current = opend;
        }
        
        for(String command : commands){
            
            if(command.equals("next")){
                current += 10;
                
                if(current > video){
                    current = video;
                }
            }else if(command.equals("prev")){
                current -= 10;
                
                if(current < 0){
                    current = 0;
                }
            }
            if(current >= opstart && current <= opend){
                current = opend;
            }
        }
        int min = current / 60;
        int sec = current % 60;
        return String.format("%02d:%02d",min,sec);
    }
}