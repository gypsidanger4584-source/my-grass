class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        
        int[] numbers = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        
        int max = numbers[0];
        int min = numbers[0];
        
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min + " " + max;
    }
}