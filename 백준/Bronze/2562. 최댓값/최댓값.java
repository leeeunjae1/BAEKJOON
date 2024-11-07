import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9];
		
		int max = Integer.MIN_VALUE;
		int row = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(br.readLine());
			
			arr[i] = a;
			
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				row = j + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(row);
		
		
	}
}