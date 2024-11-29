import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') {
                bw.write((char) ch - 'a' + 'A');
            } else {
                bw.write((char) ch - 'A' + 'a');
            }
        }
        
        bw.flush();
        bw.close();
        
    }
}