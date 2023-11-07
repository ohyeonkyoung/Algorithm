import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();

		if(0<A && A<10 && 0<B && B<10) System.out.println(A-B);
	}
}