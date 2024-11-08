import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                count = count + N / 5;
                System.out.println(count);
                return;
            }
            N = N - 3;
            count++;
        }

        System.out.println(-1);
    }
}
