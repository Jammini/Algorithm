package programmers.P42883;

/**
 * number          k     return
 * 1924              2       94
 * 1231234         3      3234
 * 4177252841    4     775841
 */
public class Algo_1v2 {
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
      StringBuilder sb = new StringBuilder(answer);

      for(int i=0;i<size;i++) {
         int tmp = -1;
         for(int j=front; j <= (i+k);j++) {   
            num = Integer.parseInt(number.substring(j, j+1));
            
            if(tmp < num ) {   
               tmp = num;
               front = j+1;
            }
            if(tmp==9){
              break;
            }
         }
         sb.insert(i, tmp);
      }
      answer=sb.toString();
      return answer;
   }
}