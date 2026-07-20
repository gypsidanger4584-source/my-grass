class Solution {
    public int[] solution(int[][] score) {
    int n = score.length;
    int[] answer = new int[n];
    int[] totalScore = new int[n];
        
        for(int i = 0; i < n; i++){
	    totalScore[i] = score[i][0] + score[i][1];
	}
	    for(int i = 0; i < n; i++){
	        int highScore = 0;
	    for(int j = 0; j < n; j++){
		    if(totalScore[j] > totalScore[i]){
			    highScore++;
			}
		}
		answer[i] = highScore + 1;
		}
	return answer;
	}
}