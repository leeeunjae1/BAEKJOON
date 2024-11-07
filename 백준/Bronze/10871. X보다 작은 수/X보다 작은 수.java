import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[A];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < A; i++) {
			int C = Integer.parseInt(st.nextToken());
			arr[i] = C;
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] < B) {
				bw.write(arr[j] + " ");
			}
		}
		
		bw.flush();
		bw.close();
		
		
	}
}