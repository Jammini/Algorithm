package programmers.P42883;

public class Algo_1v1 {
   public static void main(String[] args) {   
     System.out.println(solution("1924",2));
     System.out.println(solution("1231234",3));
     System.out.println(solution("4177252841",4));
   }
   public static String solution(String number, int k) {
      String answer="";

      int front = 0;
      int size = number.length()-k;
      int num =0;
      
      for(int i=0; i<size; i++) {
         int tmp = -1; 
         for(int j=front; j <= (i+k); j++) {   
            num = Integer.parseInt(number.substring(j, j+1));

            if(tmp < num ) {   
               tmp = num;
               front = j+1;
            }
         }
         answer += tmp;   
      }
      return answer;
   }
}