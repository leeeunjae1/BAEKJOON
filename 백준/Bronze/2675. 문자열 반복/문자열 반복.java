import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			
			String S = st.nextToken();
			
			for(int j = 0; j < S.length(); j ++) {
				for(int k = 0; k < R; k ++) {
					bw.write(S.charAt(j));
				}
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}