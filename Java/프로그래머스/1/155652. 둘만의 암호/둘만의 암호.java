class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            char c = s.charAt(i);
            
            while(count < index){
                if(c == 'z'){
                    c = 'a';
                }else{
                    c++;
                }
                if(skip.indexOf(c) != -1){
                    continue;
                }
                count++;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}