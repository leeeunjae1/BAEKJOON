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
		
		int max = -1000000;
		int min = 1000000;
		
		int A = Integer.parseInt(br.readLine());
		
		int arr[] = new int[A];
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		for(int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			arr[i] = a;
		}
		
		for(int j = 0; j <arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			if (arr[k] < min) {
				min = arr[k];
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		
	}
}