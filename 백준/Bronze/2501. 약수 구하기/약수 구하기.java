import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				arr.add(i);
				}
		}
		
		if(K <= arr.size()) {
			System.out.println(arr.get(K - 1));
		} else {
            System.out.println(0);
        }
		
	}
}