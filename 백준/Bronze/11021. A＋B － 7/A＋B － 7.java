import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int[] sum = new int[T]; // 배열 선언,크기 할당
		
		for(int i=0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			sum[i] = A + B;
			//System.out.println(sum[i]);
		}
		for(int i=0; i<T; i++) {
			System.out.println("Case #" + (i+1) + ": " + sum[i]);			
		}
	}
}
