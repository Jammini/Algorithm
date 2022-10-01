package programmers.p12953;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        boolean flag = true;
        Arrays.sort(arr);

        int cnt = 1;
        while (flag) {
            for (int i = 0; i < arr.length - 1; i++) {
                if ((arr[arr.length - 1] * cnt) % arr[i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                flag = true;
                cnt++;
            } else {
                break;
            }
        }
        return arr[arr.length - 1] * cnt;
    }
}
