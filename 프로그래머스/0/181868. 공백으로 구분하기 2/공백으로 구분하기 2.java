import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        String[] answer = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            answer[i++] = st.nextToken();
        }
        return answer;
    }
}
