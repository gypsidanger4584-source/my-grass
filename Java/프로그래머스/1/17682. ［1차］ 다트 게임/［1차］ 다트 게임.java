class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int round = 0;
        int i = 0;
        while(round < 3){
            int score;
            if(dartResult.charAt(i) == '1'&& dartResult.charAt(i + 1) == '0'){
                score = 10;
                i+=2;
            }else{
                score = dartResult.charAt(i) - '0';
                i++;
            }
            char bonus = dartResult.charAt(i);
            i++;
            if(bonus == 'D'){
                score *= score;
            }else if(bonus == 'T'){
                score *= score*score;
            }
            if(i < dartResult.length()){
                char option = dartResult.charAt(i);
                if(option == '*'){
                    score *= 2;
                    if(round > 0){
                        scores[round-1]*=2;
                    }
                    i++;
                }else if(option == '#'){
                    score *= -1;
                    i++;
                }
            }
            scores[round] = score;
            round++;
            }
        return scores[0] + scores[1] + scores[2];
        }
    }
