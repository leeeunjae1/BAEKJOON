import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }
        
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(resultList);
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
