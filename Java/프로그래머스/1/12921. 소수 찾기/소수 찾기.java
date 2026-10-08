class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] prime = new boolean[n + 1];

        // 일단 2부터 n까지 전부 소수라고 가정
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        // 소수가 아닌 수들을 제거
        for (int i = 2; i * i <= n; i++) {

            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // true인 숫자 = 소수
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                answer++;
            }
        }

        return answer;
    }
}