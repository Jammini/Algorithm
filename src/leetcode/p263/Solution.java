package leetcode.p263;

class Solution {
    boolean check=true;
    public boolean isUgly(int num) {
        if(num == 0) return check=false;
        if(num == 1) return true;

        if(num % 2 == 0){
            num = num / 2;
        }else if(num % 3 == 0){
            num = num / 3;
        }else if(num % 5 == 0) {
            num = num / 5;
        }else{
            return check= false;
        }
        isUgly(num);

        return check;
    }
}