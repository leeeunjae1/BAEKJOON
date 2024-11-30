class Solution {
    public int solution(String t, String p) {
        int result = 0;
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long current = Long.parseLong(t.substring(i, i + p.length()));
            if (current <= target) {
                result++;
            }
        }
        
        return result;
    }
}
