import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		String[] list = new String[15];
		list = input.split("");
		
		int time = 0;
		int sum = 0;

		//System.out.println(list[0]);
		//System.out.println(list[1]);
		//System.out.println(list.length);
		
		for(int i=0; i<list.length; i++) {

			time = 2;	
			
			switch (list[i]) {
			case "A": 
			case "B": 
			case "C": time += 1; sum += time;
				break;
			
			case "D": 
			case "E": 
			case "F": time += 2; sum += time;
				break;
				
			case "G": 
			case "H": 
			case "I": time += 3; sum += time;
				break;
			
			case "J": 
			case "K": 
			case "L": time += 4; sum += time;
				break;
				
			case "M": 
			case "N": 
			case "O": time += 5; sum += time;
				break;
			
			case "P": 
			case "Q": 
			case "R": 
			case "S": time += 6; sum += time;
				break;
				
			case "T": 
			case "U": 
			case "V": time += 7; sum += time;
				break;
			
			case "W": 
			case "X": 
			case "Y": 
			case "Z": time += 8; sum += time;
				break;
				
			default: time = 2; sum += time;
				break;
			}
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
	}
}