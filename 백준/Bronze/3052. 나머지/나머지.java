import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int nums[] = new int[10];
		int reminder[] = new int[10];
		
		for(int i=0; i<10; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			reminder[i] = nums[i]%42;
		}
		
		// 배열의 중복 제거 (배열을 stream 객체화 후 중복제거)
		int result[] = Arrays.stream(reminder).distinct().toArray();
		
		bw.write(Integer.toString(result.length));
		bw.flush();
		bw.close();
		br.close();
	}
}