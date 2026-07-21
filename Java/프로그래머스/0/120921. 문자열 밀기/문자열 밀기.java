class Solution {
    public int solution(String A, String B) {
        if(A.length() != B.length()) return -1;
        String plusB = B + B;
        return plusB.indexOf(A);
    }
}