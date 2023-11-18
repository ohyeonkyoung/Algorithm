import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String[] sArray = new String[S.length()];
		
		sArray = S.split("");
		
		int i = sc.nextInt();
		System.out.println(sArray[i-1]);
	}
}