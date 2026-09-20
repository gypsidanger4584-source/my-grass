import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        return IntStream.concat(
            Arrays.stream(arr).skip(a1).limit(b1-a1+1),
            Arrays.stream(arr).skip(a2).limit(b2-a2+1))
            .toArray();
    }
}