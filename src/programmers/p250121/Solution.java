package programmers.p250121;

import java.util.*;


public class Solution {
    int index = 0;
    String[] s = {"code", "date", "maximum", "remain"};
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();

        // ext 값에 따라 index 값 설정
        findIndex(ext);

        for (int[] datum : data) {
            if (datum[index] < val_ext) {
                list.add(datum);
            }
        }
        // sort_by 값에 따라 index 값 설정
        findIndex(sort_by);

        // sort_by 정렬
        list.sort(Comparator.comparing(a -> a[index]));

        return list.toArray(new int[0][]);
    }

    private void findIndex(String ext) {
        for(int i = 0; i < s.length; i++) {
            if(ext.equals(s[i])) {
                index = i;
                break;
            }
        }
    }
}
