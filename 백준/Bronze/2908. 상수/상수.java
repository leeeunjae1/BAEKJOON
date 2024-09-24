import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String N = st.nextToken();
        String M = st.nextToken();
   
        String reversedN = new StringBuilder(N).reverse().toString();
        String reversedM = new StringBuilder(M).reverse().toString();
      
        int numN = Integer.parseInt(reversedN);
        int numM = Integer.parseInt(reversedM);
        
        bw.write(String.valueOf(Math.max(numN, numM)));
        bw.flush();
        br.close();
        bw.close();
    }
}
