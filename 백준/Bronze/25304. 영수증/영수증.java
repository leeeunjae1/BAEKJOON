import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.parseInt(br.readLine());
		
		int count = Integer.parseInt(br.readLine());
		
		int cal = 0;
		
		for(int i = 0; i < count; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int price = Integer.parseInt(st.nextToken());
			int count1 = Integer.parseInt(st.nextToken());
			
			cal = cal + (price * count1);
			
		}
		
		if(cal == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}