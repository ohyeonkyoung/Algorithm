import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
			String temp = scan.nextLine();
			bw.write(temp);
			bw.newLine();
		}		
		bw.flush();	
		bw.close();	
		scan.close();
	}
}