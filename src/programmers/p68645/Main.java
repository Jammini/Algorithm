package programmers.p68645;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(4))); // [1,2,9,3,10,8,4,5,6,7]
        System.out.println(Arrays.toString(new Solution().solution(5))); // [1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
        System.out.println(Arrays.toString(new Solution().solution(6))); // [1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
    }
}
