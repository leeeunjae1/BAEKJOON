import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a == b && b == c) {
			int sum = 10000 + a * 1000;
			System.out.print(sum);
		} else if (a == b && a != c) {
			int sum = 1000 + a * 100;
			System.out.print(sum);
		} else if (a != b && b == c) {
			int sum = 1000 + b * 100;
			System.out.print(sum);
		} else if (a != b && a == c) {
			int sum = 1000 + a * 100;
			System.out.print(sum);
		} else if (a != b && b != c && a != c) {
			int max = 0;
			if(a > b) {
				max = a;
			} else if (a < b){
				max = b;
			}
			if(max > c) {
				int sum = max * 100;
				System.out.print(sum);
			} else if(max < c){
				int sum = c * 100;
				System.out.print(sum);
			}
		}
		
	}
}