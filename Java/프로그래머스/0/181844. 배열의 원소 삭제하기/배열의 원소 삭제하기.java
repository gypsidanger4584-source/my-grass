import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr)
            .boxed()
            .filter(num -> Arrays.stream(delete_list).noneMatch(del -> del == num))
            .mapToInt(Integer::intValue)
            .toArray();
    }
}