import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N; i++) {
            System.out.print(str);
        }
    }
}