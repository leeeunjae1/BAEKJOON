import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        double arr[] = new double [N];
        
        double max = Double.MIN_VALUE;
        
        double sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < N; i++) {
        	arr[i] = Double.parseDouble(st.nextToken());		

        }
        
    	for(int j = 0; j < arr.length; j++) {
        	
    		if(arr[j] > max) {
    			max = arr[j];
    		}
    	}
    	
    	for(int k = 0; k < arr.length; k++) {
    		arr[k] = arr[k] / max * 100;
    		
    		sum = sum + arr[k];
    		
    	}
    	
    	bw.write(String.valueOf(sum/N));
    	
    	br.close();
    	bw.flush();
    	bw.close();
    	
    }
}
