import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= x; i++) {
			
			sum = sum + i;
			
		}
		
		System.out.println(sum);
		
	}
}