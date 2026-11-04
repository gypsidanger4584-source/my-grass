class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ",-1);
        
        for(int i = 0; i < arr.length; i++){
            String a = arr[i];
            
            if(!a.isEmpty()){
                sb.append(Character.toUpperCase(a.charAt(0)));
                sb.append(a.substring(1).toLowerCase());
            }
            if(i < arr.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}