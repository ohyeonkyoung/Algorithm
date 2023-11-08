import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int sum;
		
		if(A==B && B==C) {
			sum = 10000 + A*1000;
		} else if(A==B || A==C) {
			sum = 1000 + A*100;
		} else if(B==C){
			sum = 1000 + B*100;
		} else if(A>B && A>C){
			sum = A*100;
		} else if(B>A && B>C){
			sum = B*100;
		} else{
			sum = C*100;
		}
		System.out.println(sum);
	}
}