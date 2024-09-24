import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String N = br.readLine();
        
        int M = Integer.parseInt(br.readLine()) - 1;
        
        System.out.print(N.charAt(M));
        
        br.close();

    }
}
