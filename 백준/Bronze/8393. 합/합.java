import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum = 0;
		
		if(1<=N && N<=10000) {
			for(int i=0; i<=N; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}
