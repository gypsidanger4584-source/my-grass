class Solution {
    public int solution(int[][] signals) {
        int[] cycle = new int[signals.length];

        for(int i = 0; i < signals.length; i++){
            cycle[i] = signals[i][0] + signals[i][1] + signals[i][2];
        }
        int maxTime = cycle[0];

        for(int i = 1; i < cycle.length; i++){
            maxTime = lcm(maxTime, cycle[i]);
        }
        for(int time = 1; time <= maxTime; time++){

            boolean allYellow = true;

            for(int i = 0; i < signals.length; i++){

                int green = signals[i][0];
                int yellow = signals[i][1];
                int cycleTime = cycle[i];
                int current = time % cycleTime;

                if(current == 0){
                    current = cycleTime;
                }
                if(current <= green || current > green + yellow){
                    allYellow = false;
                    break;
                }
            }

            if(allYellow){
                return time;
            }
        }

        return -1;
    }

    int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}