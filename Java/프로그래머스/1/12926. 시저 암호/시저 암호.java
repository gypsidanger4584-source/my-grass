class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 대문자 여부를 미리 저장해 둘 기록판 (크기는 s의 길이만큼)
        boolean[] isUpper = new boolean[s.length()];
        
        // 2. [기록 단계] 대문자인 위치를 미리 true로 체크해 둡니다.
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                isUpper[i] = true;
            }
        }
        // 3. 전체 문자열을 '싹 다 소문자'로 바꿉니다. (공백은 그대로 유지됨)
        String lowerStr = s.toLowerCase();
        // 4. 소문자 상태에서 n만큼 밀고, 원래 대문자였던 자리는 복구합니다.
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            // 공백 처리
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }
            // 소문자 기준 암호화
            char shifted = (char) (ch + n);
            if (shifted > 'z') {
                shifted = (char) (shifted - 26);
            }
            
            // [복구 단계] 아까 기록판(isUpper)에서 대문자였던 칸이라면?
            if (isUpper[i]) {
                // 다시 대문자로 만들어서 바구니에 담기
                answer.append(Character.toUpperCase(shifted));
            } else {
                answer.append(shifted);
            }
        }
        
        return answer.toString();
    }
}
