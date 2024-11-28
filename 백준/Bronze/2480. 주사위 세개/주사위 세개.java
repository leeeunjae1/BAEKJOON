import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int noon1 = Integer.parseInt(st.nextToken());
		int noon2 = Integer.parseInt(st.nextToken());
		int noon3 = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		if(noon1 == noon2 && noon1 == noon3) {
			count = 10000 + (noon1 * 1000);
		} else if(noon1 == noon2 && noon1 != noon3 || noon1 != noon2 && noon1 == noon3) {
			count = 1000 + (noon1 * 100);
		} else if (noon2 == noon3 && noon1 != noon2) {
			count = 1000 + (noon2 * 100);
		} else {
			if(noon1 > noon2 && noon1 > noon3) {
				count = noon1 * 100;
			} else if(noon1 < noon2 && noon2 > noon3) {
				count = noon2 * 100;
			} else {
				count = noon3 * 100;
			}
		}
		
		System.out.println(count);
		
	}
}