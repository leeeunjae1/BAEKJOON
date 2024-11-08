import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		int Q = 25;
		int D = 10;
		int N = 5;
		int P = 1;
		
		for(int i = 0; i < count; i++) {
			int A = Integer.parseInt(br.readLine());
			
			int q = 0, d = 0, n = 0, p = 0;
			
            if (A >= Q) {
                q = A / Q;
                A = A % Q;
            }
            if (A >= D) {
                d = A / D;
                A = A % D;
            }
            if (A >= N) {
                n = A / N;
                A = A % N;
            }
            if (A >= P) {
                p = A / P;
                A = A % P;
            }
            
            bw.write(q + " " + d + " " + n + " " + p + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}