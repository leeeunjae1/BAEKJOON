import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int sum = in.nextInt();
		
		int product = in.nextInt();
		
		int cal = 0;
		
		
		for(int i = 1; i <= product; i++) {
			
			int price = in.nextInt();
			
			int count = in.nextInt();
			
			cal = cal + (price * count);
			
		}
		
		if(sum == cal) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}