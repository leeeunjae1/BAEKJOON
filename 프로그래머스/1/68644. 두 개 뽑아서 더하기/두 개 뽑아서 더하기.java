import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                
                if (!resultList.contains(sum)) {
                    resultList.add(sum);
                }
            }
        }

        Collections.sort(resultList);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
