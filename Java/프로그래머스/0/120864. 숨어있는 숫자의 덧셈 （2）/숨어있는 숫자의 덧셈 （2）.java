class Solution{
		public int solution(String my_String){
			String rechar = my_String.replaceAll("[a-zA-Z]"," ");
				String[] space = rechar.split(" ");
				int sum = 0;
				
				for(int i = 0; i < space.length; i++){
					if(!space[i].isEmpty()){
						sum += Integer.parseInt(space[i]);
						}
					}
				return sum;
			}
		}