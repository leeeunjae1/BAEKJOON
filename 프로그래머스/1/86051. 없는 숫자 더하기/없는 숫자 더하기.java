class Solution {
    public int solution(int[] numbers) {
        int sum1 = 45;
        int sum2 = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum2 = sum2 + numbers[i];
        }
        
        return sum1 - sum2;
    }
}