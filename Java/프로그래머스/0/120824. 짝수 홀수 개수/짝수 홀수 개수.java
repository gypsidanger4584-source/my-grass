class Solution {
    public int[] solution(int[] num_list) {
        int evencnt = 0;
        int oddcnt = 0;
       
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 ==0){
                evencnt++;
            }else{
                oddcnt++;
            }
        }
        int[] answer = {evencnt,oddcnt};
        return answer;
    }
}