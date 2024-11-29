class Solution {
    public String solution(String[] seoul) {
        int N = -1;
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals ("Kim")) {
                N = i;
                break;
            }
        }
        
        return "김서방은 " + N +"에 있다";
        
    }
}