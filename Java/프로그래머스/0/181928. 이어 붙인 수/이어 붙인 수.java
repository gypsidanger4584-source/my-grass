import java.util.ArrayList;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] num_list) {
        ArrayList<Integer> evenlist = new ArrayList<>();
        ArrayList<Integer> oddlist = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++){
            (num_list[i] % 2 == 0 ? evenlist : oddlist).add(num_list[i]);
        }
        int evennum = Integer.parseInt(evenlist.stream().map(String::valueOf).collect(Collectors.joining()));
        int oddnum = Integer.parseInt(oddlist.stream().map(String::valueOf).collect(Collectors.joining()));
        return evennum+oddnum;
    }
}