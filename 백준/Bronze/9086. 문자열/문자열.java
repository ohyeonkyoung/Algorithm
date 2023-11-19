import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			String input = br.readLine();
			String[] text = new String[10];
			text = input.split("");
			bw.write(text[0]);
			bw.write(text[input.length()-1]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}