class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int Sumnum  = (numer1*denom2) + (numer2*denom1);
        int Sumden = denom1*denom2;
        
        int min = (Sumnum <= Sumden) ? Sumnum : Sumden;
        int gcd = 1;
        
        for(int i = min ; i>=2 ; i--){
            if (Sumnum % i == 0 && Sumden % i == 0) {
                gcd = i;
                break;
        }
        }
        
        
        int[] answer = {Sumnum/gcd,Sumden/gcd};
        return answer;
    }
}