import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int mok = n;
        
        List<Integer> num = new ArrayList<>();

        while (mok != 0) {
            num.add(mok % 3);
            mok = mok / 3;
        }

        int cnt = num.size() - 1;
        for (int i = 0; i < num.size(); i++) {
            answer += num.get(i) * Math.pow(3, cnt--);
        }
        
        return answer;
    }
}
