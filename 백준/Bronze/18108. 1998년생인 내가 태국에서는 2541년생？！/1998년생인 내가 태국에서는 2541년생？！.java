import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		
		if(1000<=y && y<=3000) {
			System.out.println(y-543);
		}
	}
}