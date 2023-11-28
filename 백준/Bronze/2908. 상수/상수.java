import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String input = br.readLine();
		
		String[] A = input.split(" ")[0].split("");
		String[] B = input.split(" ")[1].split("");
		
		//System.out.println(A[0] + A[1] + A[2]);
		//System.out.println(B[0] + B[1] + B[2]);
		
		for(int i=0; i<Math.ceil(A.length/2); i++) {
			String temp = A[i];
			A[i] = A[A.length-1-i];
			A[A.length-1-i] = temp;
			
			temp = B[i];
			B[i] = B[B.length-1-i];
			B[B.length-1-i] = temp;
		}
		
		String strA = "";
		String strB = "";
		
		for(int i=0; i<3; i++) {
			strA += A[i];
			strB += B[i];
		}
		
		int numA = Integer.parseInt( strA );
		int numB = Integer.parseInt( strB );
		
		if(numA>=numB) bw.write(Integer.toString(numA));
		else bw.write(Integer.toString(numB));
		
		bw.flush();
		bw.close();
		br.close();
	}
}