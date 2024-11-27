import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		int runTime = Integer.parseInt(br.readLine());
		
		int H = 0;
		int M = 0;
		
		H = runTime / 60;
		M = runTime % 60;
		
		hour = hour + H;
		minute = minute + M;
		
		if(hour >= 24) {
			hour = hour - 24;
			if(minute >= 60) {
				hour++;
				minute = minute % 60;
			}
		} else {
			if(minute >= 60) {
				hour++;
				if(hour >= 24) {
					hour = hour - 24;
				}
				minute = minute % 60;
			}
		}
		
		System.out.printf("%d %d", hour, minute);
		
	}
}