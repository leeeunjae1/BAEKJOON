import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
