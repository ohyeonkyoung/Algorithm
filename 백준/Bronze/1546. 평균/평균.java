import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt( br.readLine() ); // 시험 과목 갯수
		String scores[] = br.readLine().split(" ");
		ArrayList<Integer> realScores = new ArrayList<>(scores.length);
		int max = Integer.parseInt( scores[0] );
		
		// String -> Int 변환
		for (String score : scores) {

			realScores.add( Integer.parseInt( score ) );
			//System.out.println("realScores : " + realScores);
			
			// max 구하기
			if(realScores.size() != 1) {
				for(int i=realScores.size()-1; i<realScores.size(); i++) {
					
					if(realScores.get(i) >= max) max = realScores.get(i);
				}
			}
			
		}
		
		//System.out.println("max : " + max);
		
		ArrayList<Double> fakeScore = new ArrayList<>();
		Double sum = 0.0;
		
		for (Integer realScore : realScores) {
			
			fakeScore.add(  ((double)realScore/max*100) );
			
			//System.out.println("fakeSorce : " + fakeScore);
			
			for(int i=fakeScore.size(); i<fakeScore.size()+1; i++)
			sum += fakeScore.get(i-1);
			//System.out.println("sum : " + sum);
		}
		
		double avg = sum/fakeScore.size();
		
		bw.write(Double.toString( avg ));
		bw.flush();
		bw.close();
		br.close();
	}
}