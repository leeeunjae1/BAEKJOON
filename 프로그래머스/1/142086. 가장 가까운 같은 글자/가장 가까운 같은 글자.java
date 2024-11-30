class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] lastSeen = new int[26];

        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (lastSeen[index] == -1) {
                result[i] = -1;
            } else {
                result[i] = i - lastSeen[index];
            }

            lastSeen[index] = i;
        }

        return result;
    }
}
