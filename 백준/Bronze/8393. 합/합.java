import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0; i <= A; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}