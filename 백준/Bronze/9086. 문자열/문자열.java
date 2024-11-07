import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			String A = br.readLine();
			System.out.printf("%c%c\n", A.charAt(0), A.charAt(A.length() - 1));
		}
		
	}
}