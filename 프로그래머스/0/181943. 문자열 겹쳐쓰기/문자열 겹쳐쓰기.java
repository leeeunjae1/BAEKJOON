class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String firstPart = my_string.substring(0, s);
        String secondPart = overwrite_string;
        String thirdPart = my_string.substring(s + overwrite_string.length());
        
        return firstPart + secondPart + thirdPart;
    }
}
