import java.util.HashMap;
class Solution {
    public String solution(String[] id_pw, String[][] db){
    String inputId = id_pw[0];
    String inputPw = id_pw[1];

HashMap<String, String> dbMap = new HashMap<>();
for(String[] user : db){
	dbMap.put(user[0],user[1]);
	}
	if(!dbMap.containsKey(inputId)){
		return "fail";
		}
	if(dbMap.get(inputId).equals(inputPw)){
		return"login";
		}else{
			return "wrong pw";
			}
		}
	}