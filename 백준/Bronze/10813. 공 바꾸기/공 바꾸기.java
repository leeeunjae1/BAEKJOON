import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		for(int z = 0; z < arr.length; z++) {
			arr[z] = z + 1;
		}
		
		for(int x = 0; x < M; x++) {
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken()) -1;
			int j = Integer.parseInt(st.nextToken()) -1;
			int storage = 0;
			storage = arr[j];
			arr[j] = arr[i];
			arr[i] = storage;
		}
		
		for(int c = 0; c < arr.length; c++) {
			 bw.write(arr[c] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}