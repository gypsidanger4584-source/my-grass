class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        
        for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
            if(c == 'p'){
                pcount++;
            }else if(c == 'y'){
                ycount++;
            }
        }

        return pcount == ycount;
    }
}