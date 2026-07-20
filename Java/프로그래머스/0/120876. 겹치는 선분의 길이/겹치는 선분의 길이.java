class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int visited[] = new int[200];
        for(int[] line:lines){
	        int start = line[0];
	        int end = line[1];
	        for(int i = start; i < end; i++){
		        visited[i+100]++;
		        }
		       }
		      for(int count:visited){
			      if(count >= 2){
				      answer++;
				      }
				    }
        return answer;
    }
}