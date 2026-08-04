class Solution{
		public String solution(int[] food){
		StringBuilder sb = new StringBuilder();
			for(int i = 0; i < food.length; i++){
				int count = food[i]/2;
				for(int j = 0; j < count; j++){
					sb.append(i);
					}
				}
				return sb.toString() + "0" + new StringBuilder(sb).reverse().toString();
			}
		}