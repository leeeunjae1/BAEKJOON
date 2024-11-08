import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int res = 2;
		
		for(int i = 1; i <= n; i++) {
			res = (res - 1) + res;
		}
		System.out.print(res * res);
	}
}