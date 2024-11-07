import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[][] = new int[9][9];
		int max = Integer.MIN_VALUE;
		int row = 0;
		int column = 0;
		
		for(int i = 0; i < 9; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.print((row + 1) + " " + (column + 1));
		
	}
}