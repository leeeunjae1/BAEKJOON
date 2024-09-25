import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine().toUpperCase();  // 대소문자 구분 없이 처리하기 위해 대문자로 변환
        
        int[] freq = new int[26];  // 알파벳 A-Z의 빈도 수 저장할 배열
        
        // 각 문자의 빈도 계산
        for(int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
        }
        
        // 가장 높은 빈도를 찾고, 해당 문자의 중복 여부 확인
        int maxFreq = -1;
        char result = '?';
        boolean duplicate = false;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'A');
                duplicate = false;
            } else if (freq[i] == maxFreq) {
                duplicate = true;  // 가장 빈도가 높은 문자가 여러 개 존재
            }
        }
        
        if (duplicate) {
            bw.write("?");
        } else {
            bw.write(result);
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
