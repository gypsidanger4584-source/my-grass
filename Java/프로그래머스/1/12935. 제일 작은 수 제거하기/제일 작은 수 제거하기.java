import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        for (int num : arr) {
            list.add(num);
            if (num < min) min = num;
        }
        list.remove(Integer.valueOf(min));
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}