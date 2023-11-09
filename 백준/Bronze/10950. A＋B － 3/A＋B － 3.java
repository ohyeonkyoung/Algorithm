import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int A;
		int B;
		int[] sum = new int[T];
		
		for(int i=0; i<T; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			sum[i] = A+B;
		}
		for(int i=0; i<T; i++) System.out.println(sum[i]);	
	}
}
