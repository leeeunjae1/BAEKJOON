import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(0 < x && 0 < y) {
			System.out.print(1);
		} else if (x < 0 && 0 < y) {
			System.out.print(2);
		} else if (x < 0 && y < 0) {
			System.out.print(3);
		} else if (0 < x && y < 0) {
			System.out.print(4);
		} else {
			System.out.print("0,0");
		}
 
	}
}