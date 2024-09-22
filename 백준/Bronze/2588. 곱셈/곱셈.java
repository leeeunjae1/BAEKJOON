import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        
        int b = in.nextInt();
        
        int x = a * (b % 10);
        
        int y = a * ((b / 10) % 10);
        
        int z = a * (b / 100);
        
        System.out.println(x);
        
        System.out.println(y);
        
        System.out.println(z);
        
        System.out.print(a * b);
        
    }
}