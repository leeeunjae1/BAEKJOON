import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		// Scanner와 BufferedReader, BufferedWriter의 차이점
		// Scanner는 간편한 입출력을 위해 고안되었으며, 주로 작은 양의 입력을 처리할 때 사용.
		// BufferedReader는 대용량 데이터를 효율적으로 처리하기 위해 버퍼링을 사용해 입출력 성능을 개선.
		// BufferedWriter도 마찬가지로 출력을 버퍼링하여 빠르게 출력할 수 있다.
		// 특히, 많은 양의 데이터를 입력하거나 출력할 때 Scanner보다 성능이 훨씬 더 좋다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 위해 BufferedReader 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력을 위해 BufferedWriter 사용

		int N = Integer.parseInt(br.readLine()); // N이라는 변수에 첫 번째 입력된 값을 문자열로 받아서, 정수로 변환하여 저장

		StringTokenizer st; // 사용자 입력을 공백을 기준으로 나누기 위해 사용

		for (int i = 0; i < N; i++) {
		    st = new StringTokenizer(br.readLine()," "); // 입력된 한 줄을 공백을 기준으로 토큰 단위로 나누어 st에 저장
		    bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		    // st 객체에서 두 개의 숫자를 각각 가져와 더한 후, bw.write로 버퍼에 저장
		}

		br.close(); // BufferedReader를 닫아 자원을 해제

		bw.flush(); // 버퍼에 저장된 데이터를 한 번에 출력
		bw.close(); // BufferedWriter를 닫아 자원을 해제

 
	}
}
 