class Solution {
    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            char c = s.charAt(i);
            
            if (c >= '0' && c <= '9') {
                result.append(c);
                i++;
            } else {
                if (c == 'z') {
                    result.append('0');
                    i += 4;
                } else if (c == 'o') {
                    result.append('1');
                    i += 3;
                } else if (c == 't') {
                    if (s.charAt(i + 1) == 'w') {
                        result.append('2');
                        i += 3;
                    } else {
                        result.append('3');
                        i += 5;
                    }
                } else if (c == 'f') {
                    if (s.charAt(i + 1) == 'o') {
                        result.append('4');
                        i += 4;
                    } else {
                        result.append('5');
                        i += 4;
                    }
                } else if (c == 's') {
                    if (s.charAt(i + 1) == 'i') {
                        result.append('6');
                        i += 3;
                    } else {
                        result.append('7');
                        i += 5;
                    }
                } else if (c == 'e') {
                    result.append('8');
                    i += 5;
                } else if (c == 'n') {
                    result.append('9');
                    i += 4;
                }
            }
        }
        
        return Integer.parseInt(result.toString());
    }
}
