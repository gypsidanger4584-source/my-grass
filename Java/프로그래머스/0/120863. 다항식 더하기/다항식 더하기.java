class Solution{
		public String solution(String polynomial){
			int xCount = 0;
			int numCount = 0;
			String[] terms = polynomial.split(" ");
			for(String term : terms){
				if(term.equals("+")){
				continue;
				}
				
				if(term.contains("x")){
					if(term.equals("x")){
						xCount += 1;
					}else{
						String numstr = term.replace("x","");
						xCount += Integer.parseInt(numstr);
						}
					}
					else{
						numCount += Integer.parseInt(term);
						}
					}
					if(xCount == 0){ 
						return String.valueOf(numCount);
						}
					String xStr = (xCount == 1) ? "x" : xCount + "x";
					if(numCount == 0){
						return xStr;
						}
					return xStr+ " + " + numCount;
					}
				}
				