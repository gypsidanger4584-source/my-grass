class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        int maxcount = 0;
        int answer = 0;
        
        for(int i=0; i<count.length; i++){
            if(count[i] > maxcount){
                maxcount = count[i];
                answer = i;
            }
        }
        int dualcount = 0;
        for (int i = 0; i < count.length; i++){
            if(count[i] == maxcount){
                dualcount++;
            }
        }
        return dualcount > 1 ? -1:answer;
    }
}
