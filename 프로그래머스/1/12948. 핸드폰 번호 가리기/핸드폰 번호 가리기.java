class Solution {
    public String solution(String phone_number) {
        String result = "";
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            result += "*";
        }
        
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            result += phone_number.charAt(i);  
        }
        
        return result;
    }
}
