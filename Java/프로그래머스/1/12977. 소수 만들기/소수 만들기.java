class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                   int sum = nums[i] + nums[j] + nums[k];
                    
                    boolean prime = true;
                    for(int div = 2; div*div <= sum; div++){
                        if(sum % div == 0){
                            prime = false;
                            break;
                        }
                    }
                    if(prime){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}