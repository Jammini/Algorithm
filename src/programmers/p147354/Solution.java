package programmers.p147354;

import java.util.*;

public class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            list.add(data[i]);
        }

        // 기준에 맞게 정렬
        list.sort(
            Comparator.comparingInt((int[] a) -> a[col-1])
                .thenComparing(Comparator.comparingInt((int[] a) -> a[0]).reversed())
        );

        // row_begin <= i <= row_end XOR 해시값 반환
        for(int i = row_begin - 1; i <= row_end - 1; i++) {
            int calc = 0;
            int[] arr = list.get(i);
            for(int j = 0; j < arr.length; j++) {
                calc += arr[j] % (i + 1);

            }
            answer = answer ^ calc;
        }
        return answer;
    }
}
