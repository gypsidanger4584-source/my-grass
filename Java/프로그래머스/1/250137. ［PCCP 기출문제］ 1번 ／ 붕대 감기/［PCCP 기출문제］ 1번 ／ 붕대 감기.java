class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int count = 0;
        
        for(int time = 1; time <= attacks[attacks.length-1][0]; time++){
            boolean attacked = false;
            int damage = 0;
            
            for(int i = 0; i < attacks.length; i++){
                if(time == attacks[i][0]){
                    attacked = true;
                    damage = attacks[i][1];
                    break;
                }
            }
            if(attacked){
                currentHealth -= damage;
                count = 0;
            }else{
                currentHealth += bandage[1];
                count++;
                
                if(count == bandage[0]){
                    currentHealth += bandage[2];
                    count = 0;
                }
                if(currentHealth > health){
                    currentHealth = health;
                }
            }
            if(currentHealth <= 0){
                return -1;
            }
        }
        return currentHealth;
    }
}