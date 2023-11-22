import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt( st.nextToken() ); // 입력받을 정수의 개수
		int X = Integer.parseInt( st.nextToken() ); // X보다 작은 숫자를 찾을 예정
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < X) {
				bw.write(num + " ");
			}
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}
