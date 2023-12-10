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
		
		double A = Integer.parseInt( st.nextToken() ); // 낮에 올라가는 높이
		double B = Integer.parseInt( st.nextToken() ); // 밤에 미끄러지는 높이
		double V = Integer.parseInt( st.nextToken() ); // 나무 막대 높이
		
		int day = 0; //1 //2 //3 //4
		int height = 0; //2 1 //3 2 //4 3 //5
		
//		for(int i=0; height<=V; i++) { 
//			++day;
//			height += A;
//			if(height < V) height -= B;
//			else break;
//		}
		
		// 매일 이동하는 거리 = A-B
		// 마지막 날 이동하는 거리 <= A
		// => (A-B)(day-1)+A >= V
		day = (int) Math.ceil( (V-A)/(A-B) + 1 ); // >= 이지만 계산을 위해 =만 남김
		
		bw.write(Integer.toString(day));
		bw.flush();
		bw.close();
		br.close();
	}
}