import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		ArrayList <Integer> arr = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
        int a = arr.get(0);
        int b = arr.get(1);
        int c = arr.get(2);
        int d = arr.get(3);
        int e = arr.get(4);
        int f = arr.get(5);
        
        int x = 0;
        int y = 0;
		
        for (int i = -999; i <= 999; i++) {
            boolean found = false;
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    x = i;
                    y = j;
                    found = true;
                    break;
                }
            }
            if (found == true) break;
        }

        System.out.println(x + " " + y);
	}
}