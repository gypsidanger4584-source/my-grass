import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }else{
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}