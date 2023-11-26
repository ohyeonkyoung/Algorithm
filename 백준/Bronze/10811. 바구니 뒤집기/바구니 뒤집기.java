import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] inputs = br.readLine().split(" ");
		int N = Integer.parseInt( inputs[0] );
		int M = Integer.parseInt( inputs[1] );

		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i=0; i<N; i++) { nums.add(i+1); }
		
		for(int i=0; i<M; i++) {
			String change = br.readLine();
			
			int a = Integer.parseInt( change.split(" ")[0] );
			int b = Integer.parseInt( change.split(" ")[1] );

			// 기존의 ArrayList 중 reverse 할 부분 잘라오기
			ArrayList<Integer> sub = new ArrayList<>(nums.subList(a-1, b));
			Collections.reverse(sub);
			
			int subSize = sub.size();
			
			for(int j=a-1, k=0; j<b; j++, k++) {
				nums.remove(j);
				nums.add(j, sub.get(k));
			}
		}
		
		for (int i : nums) {
			bw.write(Integer.toString(i) + " ");
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}