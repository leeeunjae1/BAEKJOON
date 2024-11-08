import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			int sum = 0;
			
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                	arr.add(i);
                    sum = sum + i;
                }
            }
            
            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < arr.size(); i++) {
                    sb.append(arr.get(i));
                    if (i < arr.size() - 1) sb.append(" + ");
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
			
		}
		
		System.out.print(sb.toString());
		
	}
}