class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double sum = 0;
        double avg;
        
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        avg = sum / arr.length;
        
        answer = avg;
        
        return answer;
    }
}