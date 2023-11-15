import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception { // BufferedReader 사용시 예외처리 필수
		// Scanner 와 System.out.println 대신
		// BufferedReader 와 BufferedWriter 를 사용
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine()); // BufferedReade 의 return 타입 == String
		
		ArrayList<String> num = new ArrayList<>();
		//String[] num = null;
		
		StringTokenizer token;
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i=0; i<T; i++) {
			String A = reader.readLine();
			
			token = new StringTokenizer(A, " ");
			
			num.add(token.nextToken());
			num.add(token.nextToken());
		}
		//System.out.println( Integer.parseInt(num.get(0)) + Integer.parseInt(num.get(1)) );
		//System.out.println( Integer.parseInt(num.get(2)) + Integer.parseInt(num.get(3)) );
		
		for(int i=0; i<num.size()/2; i++) {
			int A, B;

			if(i==0) {
				A = Integer.parseInt(num.get(i));
				B = Integer.parseInt(num.get(i+1));
			} else {
				A = Integer.parseInt(num.get(2*i));
				B = Integer.parseInt(num.get((2*i)+1));
			} 
			//System.out.println(num);
			writer.write( String.valueOf(A+B) ); // 버퍼에 저장
			writer.newLine(); // 개행
		}
		writer.flush(); // 출력
		writer.close();
	}
}