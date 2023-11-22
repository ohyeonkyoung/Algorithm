import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt( br.readLine() );
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nums[] = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt( st.nextToken() );
		}
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i=1; i<N; i++) {
			if(nums[i] >= max) {max = nums[i];}
			if(nums[i] <= min) {min = nums[i];}
		}
		
		bw.write(Integer.toString(min) + " " + Integer.toString(max));
		bw.flush();
		bw.close();
		br.close();
	}
}