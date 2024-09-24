import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        
        Scanner in = new Scanner(System.in);
        
        char a = in.next().charAt(0);
        
        System.out.printf("%d", (int) a);

    }
}
