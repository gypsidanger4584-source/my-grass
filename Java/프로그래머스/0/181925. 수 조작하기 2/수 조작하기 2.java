class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            int diff = numLog[i] - numLog[i-1];
            String control = (diff == 1) ? "w" :
                             (diff == -1) ? "s" :
                             (diff == 10) ? "d" : "a";
            sb.append(control);
        }
        return sb.toString();
    }
}