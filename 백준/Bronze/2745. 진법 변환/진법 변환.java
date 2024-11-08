import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        int result = 0;
        
        for (int i = 0; i < A.length(); i++) {
            char C = A.charAt(i);
            int value;
            
            if (C >= '0' && C <= '9') {
                value = C - '0';
            }
            else {
                value = C - 'A' + 10;
            }
            
            result = result * B + value;
        }

        System.out.println(result);
    }
}
