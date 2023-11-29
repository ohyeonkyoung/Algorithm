import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		String[] inputArray = input.split("");
		String reverse = "";
		
		for(int i=0; i<inputArray.length; i++) {
			reverse += inputArray[inputArray.length-1-i];
			//System.out.println(reverse);
		}
		
		if(input.equals(reverse)) bw.write("1");
		else 					  bw.write("0");
		
		bw.flush();
		bw.close();
		br.close();
	}
}