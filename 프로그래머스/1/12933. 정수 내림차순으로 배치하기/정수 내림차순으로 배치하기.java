import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        
        int arr[] = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}