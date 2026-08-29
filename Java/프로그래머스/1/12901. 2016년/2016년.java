import java.time.LocalDate;
class Solution {
    public String solution(int a, int b) {
        LocalDate Date = LocalDate.of(2016,a,b);
        return Date.getDayOfWeek().name().substring(0,3);
    }
}