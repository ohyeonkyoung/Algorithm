import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if(2<=A && A<=10000 && 2<=B && B<=10000 && 2<=C && C<=10000) {
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C) * (B%C))%C);
		}
	}
}