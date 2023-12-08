import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		
		String[][] array = new String[5][15];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++ ) {
			
			String temp[] = scan.nextLine().split("");
			//System.out.println(temp.length);
			
			for(int j=0; j<15; j++) {
				if(j < temp.length) 	array[i][j] = temp[j];
				else 					array[i][j] = " ";
			}	
		}
		String output = "";
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				output += (array[j][i]);
			}
		}
		output = output.replaceAll(" ", ""); // 공백 제거
		System.out.println(output);

	}
}