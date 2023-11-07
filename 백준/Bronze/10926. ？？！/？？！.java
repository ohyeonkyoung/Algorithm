import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String id = scan.nextLine().toLowerCase();
		
		if(id.length()<=50) System.out.println(id+"??!");
	}
}