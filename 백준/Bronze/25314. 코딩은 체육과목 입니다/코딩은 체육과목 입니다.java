import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int intN = Integer.parseInt(N);
		String type = "long int";
		
		if(intN==4) bw.write(type);
		else {
			while ((intN-4) != 0) {
				intN -= 4;
				type = "long " + type;
			}
			bw.write(type);
		}	
		bw.flush();
		bw.close();
	}
}