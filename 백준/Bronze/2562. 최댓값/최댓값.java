import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[9];
		
		for(int i=0; i<9; i++) {
			String a = br.readLine();
			nums[i] = Integer.parseInt(a);
		}
		
		int max = nums[0];
		int maxNum = 0;
		
		for(int i=0; i<9; i++) {
			if(max<=nums[i]) {
				max = nums[i];
				maxNum = i;
			}
		}
		
		bw.write(Integer.toString(max));
		bw.newLine();
		bw.write(Integer.toString(maxNum+1));
		bw.flush();
		bw.close();
		br.close();
	}
}