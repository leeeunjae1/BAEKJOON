import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		if(x % 4 ==0 && x % 100 !=0 || x % 400 ==0) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
 
	}
}