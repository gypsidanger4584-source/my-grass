import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int start_index = n-1;
        return Arrays.copyOfRange(num_list,start_index,num_list.length);
    }
}