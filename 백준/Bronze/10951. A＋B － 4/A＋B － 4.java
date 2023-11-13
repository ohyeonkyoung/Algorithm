import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int A = 0;
      int B = 0;
      List<Integer> sum = new ArrayList<>(); // ArrayList 선언, 사이즈 X
      
      while (scan.hasNext()) { // EOF == End Of File
         A = scan.nextInt();
         B = scan.nextInt();
         
         sum.add(A+B);
      }
      scan.close();
      
      for(int i=0; i<sum.size(); i++) {
         System.out.println(sum.get(i));   // ArrayList 에서 값 꺼내기      
      }
   }
}