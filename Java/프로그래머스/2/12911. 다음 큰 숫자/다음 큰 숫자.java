class Solution {
    public int solution(int n) {
        int count = Integer.toBinaryString(n).replace("0","").length();
        
        for(int i = n+1; ; i++){
            String Binary = Integer.toBinaryString(i);
            
            if(Binary.replace("0","").length() == count){
                return i;
            }
        }
    }
}