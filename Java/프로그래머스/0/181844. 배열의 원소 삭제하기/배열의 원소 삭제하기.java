import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        ArrayList<Integer> delList = new ArrayList<>();
        for(int num : delete_list){
            delList.add(num);
        }
        for(int i = 0; i < arr.length; i++){
            if(!delList.contains(arr[i])){
                resultList.add(arr[i]);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
        
    }
}