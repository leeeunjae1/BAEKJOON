import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String N = br.readLine();
    	
    	boolean isPalindrome = true;
    	
    	for(int i = 0; i < N.length() / 2; i++) {
    		if(N.charAt(i) != N.charAt(N.length() - 1 - i)) {
    			isPalindrome = false;
    			break;
    		}
    	}
    	
    	if(isPalindrome) {
    		bw.write("1");
    	} else {
    		bw.write("0");
    	}
    	
    	br.close();
    	bw.flush();
    	bw.close();
    	
    }
}
