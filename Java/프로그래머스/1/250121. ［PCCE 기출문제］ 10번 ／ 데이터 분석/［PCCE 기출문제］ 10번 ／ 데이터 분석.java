import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> types = Arrays.asList("code","date","maximum","remain");
        int extIndex = types.indexOf(ext);
        int sortIndex = types.indexOf(sort_by);
        List<int[]> result = new ArrayList<>();
        for(int[] row : data){
            if(row[extIndex] < val_ext){
                result.add(row);
            }
        }
        result.sort((a,b) -> Integer.compare(a[sortIndex],b[sortIndex]));
        return result.toArray(new int[result.size()][]);
    }
}