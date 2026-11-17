class Solution {
    public int[] solution(int brown, int yellow) {
        
        for(int width = 3; width <= brown + yellow; width++){
            for(int height = 3; height <= brown + yellow; height++){
                
                if(width * height == brown + yellow &&
                    (width - 2) * (height - 2) == yellow){
                    return new int[]{height,width};
                }
            }   
        }
        return new int[]{};
    }
}