import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int target = 1;
        while(target < arr.length){
            target *= 2;
        }
        return Arrays.copyOf(arr,target);
    }
}