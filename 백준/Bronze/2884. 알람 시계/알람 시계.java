import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(0<=M && M<45) {
			H = H-1;
			M = M+60-45;
			if(H==24) H = 0;
			if(H==-1) H = 23;
		} else {
			M = M-45;
		}
		System.out.println(H + " " + M);
	}
}