import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int colorPaper = Integer.parseInt( scan.nextLine() );
		
		int[][] whitePaper = new int[100][100];
		
		for(int i=0; i<colorPaper; i++) {
			String input[] = scan.nextLine().split(" ");
			int x = Integer.parseInt( input[0] );
			int y = Integer.parseInt( input[1] );
			
			for(int a=x; a<x+10; a++) {
				for(int b=y; b<y+10; b++) {
					whitePaper[a][b] += 1;					
				}
			}
		}
		
		int count = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(whitePaper[i][j] == 0) {
					count++;
				} 
			}
		}
		System.out.println(100*100 - count);
	}
}