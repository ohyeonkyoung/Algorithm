import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = B + C;
		
		if(B+C>=60) {
			A = A+(int)((B+C)/60);
			D = (B+C)%60;
		}
		
		if(A>=24) A=A-24;
		
		System.out.println(A + " " + D);
	}
}