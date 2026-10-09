class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int lh = 3, lw = 0, rh = 3, rw = 2;

        for (int n : numbers) {
            int row = n == 0 ? 3 : (n - 1) / 3;
            int col = n == 0 ? 1 : (n - 1) % 3;
            boolean left;

            if (col == 0) left = true;
            else if (col == 2) left = false;
            else {
                int l = Math.abs(lh - row) + Math.abs(lw - col);
                int r = Math.abs(rh - row) + Math.abs(rw - col);
                left = l == r ? hand.equals("left") : l < r;
            }

            if (left) {
                answer.append("L");
                lh = row;
                lw = col;
            } else {
                answer.append("R");
                rh = row;
                rw = col;
            }
        }
        return answer.toString();
    }
}