import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		if(90 <= x && x <=100) {
			System.out.print("A");
		} else if (80 <= x && x < 90) {
			System.out.print("B");
		} else if (70 <= x && x < 80){
			System.out.print("C");
		} else if (60 <= x && x < 70) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}
 
	}
}