import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());
		
		System.out.println(A / B);
		
	}
}