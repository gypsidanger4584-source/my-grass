class Solution {
    public String solution(String letter) {
        String[] mors = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] sa = letter.split(" ");
        char[] answer = new char[sa.length];

        for(int i =0; i<sa.length; i++){
            for(int j=0; j < mors.length; j++){
                if(mors[j].equals(sa[i])){
                    answer[i] = (char) (j+'a');
                    break;
                }
            }
        }

        return new String(answer);
    }
}