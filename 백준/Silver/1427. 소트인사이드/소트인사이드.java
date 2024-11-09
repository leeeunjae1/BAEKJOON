import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] counting = new int[10];
        
        int N = Integer.parseInt(br.readLine());
        
        while (N != 0) {
            counting[N % 10]++;
            N /= 10;
        }
        
        for (int i = 9; i >= 0; i--) {
            while (counting[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}
