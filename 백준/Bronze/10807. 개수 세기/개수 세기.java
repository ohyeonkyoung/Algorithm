import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 입력받는 정수의 개수
		StringTokenizer st = new StringTokenizer(br.readLine()); // 입력받는 정수
		int v = Integer.parseInt(br.readLine()); // 찾으려는 정수
		
		int[] list = new int[N];
		
		for(int i=0; i<N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if(list[i] == v) count++;
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		br.close();
	}
}