import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] arr = new char[5][15];
		
		// 배열 초기화
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		// 세로로 읽기
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				// 빈 칸이 아닌 경우에만 출력
				if (arr[i][j] != '\0') {
					bw.write(arr[i][j]);
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}
