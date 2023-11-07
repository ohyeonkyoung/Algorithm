import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(1<=A && A<=10000 && 1<=B && B<=10000) {
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		}
	}
}