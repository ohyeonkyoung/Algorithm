import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if(1<=N && N<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(N + " * " + i + " = " + N*i);
			}
		}
	}
}
