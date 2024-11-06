import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		if(minute < 45) {
			if(hour == 0) {
				minute = minute + 15;
				hour = hour + 23;
			} else {
				minute = minute + 15;
				hour = hour - 1;
			}
		} else {
			minute = minute - 45;
		}
		
		System.out.printf("%d %d", hour, minute);
	}
}