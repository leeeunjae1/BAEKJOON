import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x != 0 && y >= 45 && x >= 0 && x <= 24 && y >=0 && y <= 59) {
			System.out.printf("%d %d", x, y - 45);
		} else if (x != 0 && y < 45 && x >= 0 && x <= 24 && y >=0 && y <= 59) {
			System.out.printf("%d %d", x - 1, y + 15);
		} else if (x == 0 && y >= 45 && x >= 0 && x <= 24 && y >=0 && y <= 59) {
			System.out.printf("%d %d", x, y-45);
		} else if (x == 0 && y < 45 && x >= 0 && x <= 24 && y >=0 && y <= 59) {
			System.out.printf("%d %d", x + 23, y + 15);
		} else {
			System.out.print("알람시계 에러발생");
		}
	}
}