package practice.implementation.p7;

class Solution {

    public int solution(int[] keypad, String password) {
        int answer = 0;

        int[][] keypadArr = new int[3][3];
        int[][] distance = new int[10][10];
        int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

        int num = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keypadArr[i][j] = keypad[num++];
            }
        }

        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < distance[0].length; j++) {
                if (i == j) {
                    continue;
                }
                distance[i][j] = 2;
            }
        }

        for (int i = 0; i < keypadArr.length; i++) {
            for (int j = 0; j < keypadArr.length; j++) {
                int x = keypadArr[i][j];
                for (int k = 0; k < dx.length; k++) {
                    if (i + dx[k] >= 0 && i + dx[k] < 3 && j + dy[k] >= 0 && j + dy[k] < 3) {
                        int hit = keypadArr[i + dx[k]][j + dy[k]];
                        distance[x][hit] = 1;
                        distance[hit][x] = 1;
                    }
                }
            }
        }
        char[] passwordCharArray = password.toCharArray();

        for (int i = 0; i < passwordCharArray.length - 1; i++) {
            int x = Integer.parseInt(passwordCharArray[i] + "");
            int y = Integer.parseInt(passwordCharArray[i + 1] + "");
            answer += distance[x][y];
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}