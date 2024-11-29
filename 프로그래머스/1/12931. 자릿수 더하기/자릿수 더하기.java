import java.util.*;

public class Solution {
    public int solution(int n) {
        String N = String.valueOf(n);  
        int sum = 0;
        for(int i = 0; i < N.length(); i++) {
            sum = sum + N.charAt(i) - '0';
        }
        return sum;
    }
}