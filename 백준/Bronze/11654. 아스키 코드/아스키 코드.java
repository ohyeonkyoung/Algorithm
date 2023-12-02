import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		
		// 입력 : String(연속적) => Char(단일) => ASCII
		// 1-1. 한 글자만 가져오기 : charAt() 로 특정 순번의 글자 가져오기
			// char N = br.readLine().charAt(0);
		// 1-2. 여러 글자 가져오기 : toCharArray() 로 모든 글자를 Char 배열에 넣기
			// char[] arr = br.readLine().toCharArray();
		// 2. 가져온 Char 데이터 ASCII로 나타내기
		// 2-1. Char => int 형변환
			// int num = N; 
		// 2-2. byte 형변환
			// byte num = (byte)N;
		// 3.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputString = br.readLine(); // 입력값
		
		char inputChar = inputString.charAt(0);
		
		int inputInt = inputChar; // char 에서 int는 자동으로 형변환된다.
	
		System.out.println(inputInt);
		
		// bw.write(inputInt);
		// bw.flush();
		// bw.close();
		br.close();
	}
}