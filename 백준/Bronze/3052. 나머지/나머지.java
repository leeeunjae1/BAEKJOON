import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int Num = 42;
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            set.add(N % Num);
        }
        
        bw.write(String.valueOf(set.size()));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
