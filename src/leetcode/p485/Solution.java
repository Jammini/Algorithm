package leetcode.p485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer=0;
        int cnt=0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                cnt++;
            }else{
                if(answer < cnt){
                    answer = cnt;
                }
                cnt=0;
            }
        }
        if(answer < cnt){
            answer = cnt;
        }
        return answer;
    }
}