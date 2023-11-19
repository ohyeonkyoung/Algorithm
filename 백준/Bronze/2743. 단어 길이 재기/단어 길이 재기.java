import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] S = new char[100];
		S = br.readLine().toCharArray();
		
		String length = Integer.toString(S.length);
		
		bw.write(length);
		bw.flush();
		
		br.close();
		bw.close();
	}
}