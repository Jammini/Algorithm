package leetcode.p1603;

public class Solution {
    private int big;
    private int medium;
    private int small;

    public Solution(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            return big--!=0;
        }else if(carType == 2){
            return medium--!=0;
        }else if(carType == 3){
            return small--!=0;
        }
        return false;
    }
}
