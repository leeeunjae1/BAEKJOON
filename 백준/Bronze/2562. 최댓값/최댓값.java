import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		int max = Integer.MIN_VALUE;
		
		int arrmax = 0;
		
		for(int i = 0; i < 9; i ++) {
			arr[i] = in.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				arrmax = i;
			}
		}
		
		System.out.print(max + " " + (arrmax+1));
		
		
	}
}