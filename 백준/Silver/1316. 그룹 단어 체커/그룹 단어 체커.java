import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		
		for(int i = 0; i < N; i++) {
					
			if(ch() == true) {
				count++;
			}
			
		}
		
		bw.write(count + "\n");
		br.close();
		bw.flush();
		bw.close();
		
	}
	
	public static boolean ch() throws IOException {
		
		boolean[] check = new boolean[26];
		
		int prev = 0;
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
				}
				else {
					return false;
				}
			} else {
				continue;
			}
		}
		
		return true;
		
	}
	
}