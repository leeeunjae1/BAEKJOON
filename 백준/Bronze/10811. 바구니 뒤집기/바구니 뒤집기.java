import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[N];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; 
        }
        
        for(int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()) - 1; 
            int B = Integer.parseInt(st.nextToken()) - 1; 
            
            while (A < B) {
                int temp = arr[A];
                arr[A++] = arr[B];
                arr[B--] = temp;
            }
        }
        
        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
