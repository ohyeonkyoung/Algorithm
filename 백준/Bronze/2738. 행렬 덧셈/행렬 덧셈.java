import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String NM[] = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		int result[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			String temp[] = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				A[i][j] = Integer.parseInt( temp[j] );
			}
		}
		
		for(int i=0; i<N; i++) {
			String temp[] = br.readLine().split(" ");
			for(int j=0; j<M; j++) {
				B[i][j] = Integer.parseInt( temp[j] );
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}	
	}
}