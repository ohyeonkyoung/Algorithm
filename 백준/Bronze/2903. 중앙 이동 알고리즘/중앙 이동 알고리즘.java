import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 2 (+1) 3 (+2) 5 (+4) 9 (+8) 17
		
		int hap = 2;
		
		for(int i=0; i<N; i++) {
			//System.out.println(Math.pow(2, i));
			hap += Math.pow(2, i);
		}
		System.out.println( hap*hap );
	}
}