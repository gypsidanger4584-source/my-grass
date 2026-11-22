class Solution {
    public long[] solution(int n, long left, long right) {
        
        long[] result = new long[(int)(right - left + 1)];
        
        for(long i = left; i <= right; i++){
            
            long rownum = i / n;
            long colnum = i % n;
            
            long value = Math.max(rownum,colnum) + 1;
            
            result[(int)(i - left)] = value;
        }
        return result;
    }
}