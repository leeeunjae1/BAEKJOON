class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        if(a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else {
            max = a;
            min = b;
        }
        
        for(int i = min; i <= max; i++) {
            if(min == max) {
                return i;
            } else {
                answer = answer + i;
            }
        }
        
        return answer;
    }
}