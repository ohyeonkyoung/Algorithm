import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

		public static void main(String[] args) throws Exception {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
			
			for(int i=0; i<T; i++) { 
				String RS = br.readLine(); 

				String[] arrayRS = RS.split(" ");
	
				int R = Integer.parseInt( arrayRS[0] ); // 반복 횟수
				String S = arrayRS[1]; // 반복해야하는 문자
				
				String[] arrayS = S.split("");
				
				for(int j=0; j<arrayS.length; j++) {
					for(int k=0; k<R; k++) {
						bw.write(arrayS[j]);
					}	
				}
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			br.close();
		}
}