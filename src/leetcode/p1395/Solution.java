package leetcode.p1395;

public class Solution {
    public int numTeams(int[] rating) {

        /*int answer = 0;

        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i + 1; j < rating.length-1; j++) {
                if (rating[i] < rating[j]) {
                    for (int k = j+1; k < rating.length; k++) {
                        if (rating[j] < rating[k]){
                            answer++;
                        }
                    }
                } else if (rating[i] > rating[j]){
                    for (int k = j; k < rating.length; k++) {
                        if (rating[j] > rating[k]){
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;*/
        int res = 0;
        for (int i = 1; i < rating.length - 1; ++i) {
            int less[] = new int[2], greater[] = new int[2];
            for (int j = 0; j < rating.length; ++j) {
                System.out.println("rating[i] = " + rating[i] + " rating[j] = " + rating[j]);
                if (rating[i] < rating[j]){
                    ++less[j > i ? 1 : 0];
                    System.out.println("less[0] = "+ less[0] + " less[1] = " + less[1]);
                }

                if (rating[i] > rating[j]){
                    ++greater[j > i ? 1 : 0];
                    System.out.println("greater[0] = "+ greater[0] + " greater[1] = " + greater[1]);
                }

            }
            System.out.println("less[0] = "+ less[0] + " less[1] = " + less[1]);
            System.out.println("greater[0] = "+ greater[0] + " greater[1] = " + greater[1]);
            res += less[0] * greater[1] + greater[0] * less[1];
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡresult = " + res );
        }
        return res;
    }
}
