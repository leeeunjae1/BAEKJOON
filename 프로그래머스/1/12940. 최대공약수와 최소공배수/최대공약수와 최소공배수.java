class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        int lcm = (n * m) / gcd;

        return new int[] {gcd, lcm};
    }
}
