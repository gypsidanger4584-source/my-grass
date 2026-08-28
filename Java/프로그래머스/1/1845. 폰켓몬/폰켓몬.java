import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int maxSelect = nums.length/2;
        HashSet<Integer> monType = new HashSet<>();
        for(int num : nums){
            monType.add(num);
        }
        return Math.min(monType.size(),maxSelect);
    }
}