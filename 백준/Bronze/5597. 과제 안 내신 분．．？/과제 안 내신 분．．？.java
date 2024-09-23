import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[30];
		
		int num1 = 0;
		
		int num2 = 0;
		
		for(int i = 0; i < 28; i++) {
			int N = Integer.parseInt(br.readLine());
			arr[N - 1] = N;
		}
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == 0 && num1 ==0) {
				num1 = j + 1;
			} else if (arr[j] == 0 && num1 != 0) {
				num2 = j + 1;
			}
		}
		
        if (num1 > num2) {
            bw.write(String.valueOf(num2) + "\n");
            bw.write(String.valueOf(num1) + "\n");
        } else {
            bw.write(String.valueOf(num1) + "\n");
            bw.write(String.valueOf(num2) + "\n");
        }
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}