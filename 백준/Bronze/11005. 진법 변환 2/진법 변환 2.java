import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        StringBuilder result = new StringBuilder();
        
        while (N > 0) {
            int A = N % B;
            if (A >= 10) {
                result.append((char) ('A' + (A - 10)));
            } else {
                result.append(A);
            }
            N = N / B;
        }
        
        System.out.println(result.reverse().toString());
    }
}
