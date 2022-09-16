package programmers.p42889;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(5, (new int[]{2, 1, 2, 6, 2, 4, 3, 3})))); // 3,4,2,1,5
        System.out.println(Arrays.toString(new Solution().solution(4, (new int[]{4, 4, 4, 4, 4})))); // 4, 1, 2, 3
        System.out.println(Arrays.toString(new Solution().solution(5, (new int[]{3, 3, 3, 3})))); // 3, 1, 2, 4, 5
        System.out.println(Arrays.toString(new Solution().solution(5, (new int[]{3})))); // 4,1,2,3
    }
}
