package programmers.p340198;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int count = 0;
        boolean flag = false;

        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[i].length; j++) {
                String s = park[i][j];

                if(s.equals("-1")) {
                    count = Math.max(count, findCount(park, i, j));
                }
            }
        }

        for(int i = 0; i < mats.length; i++) {
            if(count >= mats[i]) {
                flag = true;
                answer = Math.max(mats[i], answer);
            }
        }
        if (!flag) {
            return -1;
        }
        return answer;
    }

    private int findCount(String[][] park, int x, int y) {
        int count = 1;
        boolean flag = false;

        while (true) {
            int countX = x + count;
            int countY = y + count;

            if (countX > park.length || countY > park[x].length) {
                return --count;
            }

            for (int i = x; i < countX; i++) {
                for (int j = y; j < countY; j++) {
                    if (!park[i][j].equals("-1")) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                count--;
                break;
            }
            count++;
        }
        return count;
    }
}
