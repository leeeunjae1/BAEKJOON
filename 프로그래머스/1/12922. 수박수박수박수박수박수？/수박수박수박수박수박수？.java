class Solution {
    public String solution(int n) {
        String A = "수";
        String B = "박";
        String result = "";
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                result = result + A;
            } else {
                result = result + B;
            }
        }
        return result;
    }
}