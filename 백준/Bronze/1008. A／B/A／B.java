import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();

		if(0<A && A<10 && 0<B && B<10) System.out.printf("%.15f", A/B);

	}

}