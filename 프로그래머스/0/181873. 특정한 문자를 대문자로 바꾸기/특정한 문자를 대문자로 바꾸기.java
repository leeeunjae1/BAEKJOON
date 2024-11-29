class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                sb.setCharAt(i, Character.toUpperCase(alp.charAt(0)));
            }
        }
        
        return sb.toString();
    }
}
