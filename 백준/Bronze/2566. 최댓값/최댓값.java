import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int[][] array = new int[9][9];
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(scan.nextLine(), " ");
			for(int j=0; j<9; j++) {
				array[i][j] = Integer.parseInt( st.nextToken() );
			}
		}

		int max = array[0][0];
		int row = 1;
		int column = 1;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(array[i][j] > max) {
					max = array[i][j];	
					row = i+1;
					column = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row + " " + column);
	}
}