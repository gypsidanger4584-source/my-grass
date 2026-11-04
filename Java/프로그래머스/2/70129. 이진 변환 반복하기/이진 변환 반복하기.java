class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int zeroCount = 0;
        
        while(!s.equals("1")){
            int before = s.length();
            s = s.replace("0","");
            zeroCount += before - s.length();
            
            s = Integer.toBinaryString(s.length());
            count++;
        }
        return new int[]{count,zeroCount};
    }
}