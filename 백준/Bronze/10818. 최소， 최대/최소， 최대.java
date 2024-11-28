import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < arr.length; i++) {
			int A =Integer.parseInt(st.nextToken());
			arr[i] = A;
		}
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.printf("%d %d", min, max);
		
	}
}