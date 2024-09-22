import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a >= 0 && a <= 23 && b >= 0 && b <= 59 && c >= 0 && c <= 1000) {
			if(b + c > 59) {
				int x = (b + c) % 60; 
				int y = (b + c) / 60;
				System.out.printf("%d %d", (a + y) % 24, x);
			} else if (b + c < 59) {
				System.out.printf("%d %d", a, b + c);
			}
		} else {
			System.out.print("오븐 사용 에러");
		}
		
	}
}