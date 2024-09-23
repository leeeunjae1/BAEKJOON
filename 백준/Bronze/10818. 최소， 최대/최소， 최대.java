import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		int max = Integer.MIN_VALUE;;
		
		int min = Integer.MAX_VALUE;;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}