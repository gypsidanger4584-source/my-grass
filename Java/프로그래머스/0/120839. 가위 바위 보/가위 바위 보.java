import java.util.Map;
class Solution {
    public String solution(String rsp) {
    Map<String,String> win = Map.of("2","0","0","5","5","2");
        StringBuilder answer = new StringBuilder();
        String arr[] = rsp.split("");
        for(String current : arr){
            answer.append(win.get(current));
        }
        return answer.toString();
    }
}