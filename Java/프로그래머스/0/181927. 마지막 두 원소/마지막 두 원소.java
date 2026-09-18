import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = Arrays.copyOf(num_list,num_list.length+1);
        answer[n] = (num_list[n-1] > num_list[n-2] ? num_list[n-1] - num_list[n-2] : num_list[n-1]*2);
            return answer;
    }
}