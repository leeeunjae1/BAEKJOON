import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
        	String S = br.readLine();
        	char A = S.charAt(0);
        	char B = S.charAt(S.length()-1);
        	bw.write(A + "" + B + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();

    }
}
