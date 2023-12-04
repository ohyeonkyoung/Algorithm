import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// Quarter = 0.25
		// Dime = 0.10
		// Nickel = 0.05
		// Penny = 0.01
		// 1 <= 거스름돈(C) <= 500
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt( br.readLine() );
		
		for(int i=0; i<T; i++) {
			int C = Integer.parseInt( br.readLine() );
			int numQ = (int) Math.floor(C/25);
			//System.out.println(numQ);
			int numD = (int) Math.floor( (C-numQ*25)/10 );
			int numN = (int) Math.floor( (C-numQ*25-numD*10)/5 );
			int numP = (int) Math.floor( (C-numQ*25-numD*10-numN*5)/1 );
			
			System.out.println(numQ + " " + numD + " " + numN + " " +numP);
		}
	}
}