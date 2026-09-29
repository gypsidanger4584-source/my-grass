import java.util.ArrayList;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> basket = new ArrayList<>();
        
        for(int i = 0; i < ingredient.length; i++){
            basket.add(ingredient[i]);
            if(basket.size() >= 4){
                if(basket.get(basket.size() - 4) == 1 &&
                    basket.get(basket.size() - 3) == 2 &&
                    basket.get(basket.size() - 2) == 3 &&
                    basket.get(basket.size() - 1) == 1){
                    answer++;
                for(int j = 0; j < 4; j++){
                    basket.remove(basket.size()-1);
                }
                }
            }
        }
        return answer;
    }
}