package programmers.p154540;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    int[][] arrMaps;
    int[] row = {0, 1, 0, -1}; // 시계 방향 상 우 하 좌
    int[] column = {-1, 0, 1, 0};

    public int[] solution(String[] maps) {
        int[] answer;
        arrMaps = new int[maps.length + 2][maps[0].length() + 2];
        List<Integer> list = new ArrayList<>();
        // 2차원 배열로 변환
        convertArray(maps);

        // 무인도를 구해 리스트에 담는다.다을
        for (int i = 1; i < arrMaps.length - 1; i++) {
            for (int j = 1; j < arrMaps[i].length - 1; j++) {
                if (arrMaps[i][j] > 0) {
                    int sum = arrMaps[i][j];
                    arrMaps[i][j] = 0;
                    list.add(saveIslandSize(i, j, sum));
                }
            }
        }

        // 무인도가 없으면 -1 리턴
        if (list.size() == 0) {
            return new int[]{-1};
        }
        // 있으면 오름차순으로 배열에 담아 리턴
        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private void convertArray(String[] maps) {
        for (int i = 1; i < arrMaps.length - 1; i++) {
            String[] split = maps[i - 1].split("");
            for (int j = 1; j < arrMaps[i].length - 1; j++) {
                arrMaps[i][j] = split[j - 1].equals("X") ? 0 : Integer.parseInt(split[j - 1]);
            }
        }
    }

    private int saveIslandSize(int i, int j, int sum) {
        for (int k = 0; k < 4; k++) {
            if (arrMaps[i + column[k]][j + row[k]] > 0) {
                int numericValue = arrMaps[i + column[k]][j + row[k]];
                arrMaps[i + column[k]][j + row[k]] = 0;
                sum += saveIslandSize(i + column[k], j + row[k], numericValue);
            }
        }
        return sum;
    }
}
