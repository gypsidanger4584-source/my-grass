class Solution {
    public int[] solution(String[] wallpaper) {
        
        int up = wallpaper.length;
        int down = 0;
        int left = wallpaper[0].length()+1;
        int right = 0;
        
        for(int i = 0; i < wallpaper.length; i++){
            String row = wallpaper[i];
            
            for(int j = 0; j < row.length(); j++){
                char c = row.charAt(j);
                
                if(c == '#'){
                    if(i < up){
                        up = i;
                    }
                    if(i > down){
                        down = i;
                    }
                    if(j < left){
                        left = j;
                    }
                    if(j > right){
                        right = j;
                    }
                }
            }
        }
        return new int[]{up,left,down+1,right+1};
    }
}