import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int count = in.nextInt();
		
		int refeat = count / 4;
		
		String a = "long";
		
		for(int i = 1; i <= refeat; i++) {
			System.out.print(a + " ");
		}
		System.out.print("int");
		
	}
}