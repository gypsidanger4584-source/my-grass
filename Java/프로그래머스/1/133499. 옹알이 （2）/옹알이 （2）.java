class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String prev = "";

            while (!word.isEmpty()) {
                boolean found = false;

                for (String sound : sounds) {
                    if (!sound.equals(prev) && word.startsWith(sound)) {
                        word = word.substring(sound.length());
                        prev = sound;
                        found = true;
                        break;
                    }
                }

                if (!found) break;
            }

            if (word.isEmpty()) answer++;
        }

        return answer;
    }
}