class Solution {
    public int solution(int[] num_list) {
        int oddPlus = 0;
        int evenPlus = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                oddPlus += num_list[i];
            }else{
                evenPlus += num_list[i];
            }
        }
        return (oddPlus > evenPlus) ? oddPlus : evenPlus;
    }
}