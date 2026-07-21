class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while(coupon >= 10){
            int newchick = coupon / 10;
            int restcoupon = coupon % 10;
            answer += newchick;
            coupon = newchick + restcoupon;
        }
        return answer;
    }
}