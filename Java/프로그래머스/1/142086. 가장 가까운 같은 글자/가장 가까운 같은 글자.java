	import java.util.*;
	class Solution{
			public int[] solution(String s){
				int[] answer = new int[s.length()];
				Map<Character,Integer> map = new HashMap<>();
				
				for(int i = 0; i < s.length(); i++){
					char current = s.charAt(i);
					if(!map.containsKey(current)){
						answer[i] = -1;
						}else{
						int lastIndex = map.get(current);
						answer[i] = i - lastIndex;
						}
						map.put(current,i);
						}
					return answer;
					}
				}