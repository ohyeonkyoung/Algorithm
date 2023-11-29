import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		// 공백을 입력했을 때, split을 사용하면 0이 아닌 1이 나온다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine().trim();
		String[] text = input.split(" ");
        
		if(input == "") bw.write("0");
		else bw.write(Integer.toString(text.length));
        
		bw.flush();
		bw.close();
		br.close();
	}
}