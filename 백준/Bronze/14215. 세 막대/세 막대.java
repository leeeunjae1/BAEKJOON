import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] sides = new int[3];
        
        for (int i = 0; i < 3; i++) {
            sides[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sides);
        
        if (sides[0] + sides[1] > sides[2]) {
            System.out.println(sides[0] + sides[1] + sides[2]);
        } else {
            System.out.println((sides[0] + sides[1]) * 2 - 1);
        }
    }
}
