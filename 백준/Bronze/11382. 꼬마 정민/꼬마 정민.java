import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		
		if(1<=A && A<=Math.pow(10, 12) && 1<=B && B<=Math.pow(10, 12) && 1<=C && C<=Math.pow(10, 12)) {
			System.out.println(A+B+C);
		}
	}
}
