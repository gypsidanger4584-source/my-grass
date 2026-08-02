import java.util.Arrays;
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        Arrays.sort(number);
        for(int i = 0; i < number.length - 2; i++){
            for(int j = i+1; j < number.length -1; j++){
                for(int k = j+1; k < number.length; k++){
                    int num1 = number[i];
                    int num2 = number[j];
                    int num3 = number[k];
                    if(num1+num2+num3 == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}