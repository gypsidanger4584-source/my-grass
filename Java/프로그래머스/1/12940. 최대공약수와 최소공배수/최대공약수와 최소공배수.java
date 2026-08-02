import java.math.BigInteger;
class Solution {
    public int[] solution(int n, int m) {
        BigInteger b1 = BigInteger.valueOf(n);
        BigInteger b2 = BigInteger.valueOf(m);
        int gcd = b1.gcd(b2).intValue(); 
        return new int[]{gcd, (n * m) / gcd};
    }
}