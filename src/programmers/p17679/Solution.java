package programmers.p17679;

class Solution {
    String[][] boards;
    String[][] checkBoards;

    public int solution(int m, int n, String[] board) {
        int answer = 0;
        boards = new String[m][n];
        checkBoards = new String[m][n];

        for (int i = 0; i < m; i++) {
            String[] b = board[i].split("");
            for (int j = 0; j < n; j++) {
                boards[i][j] = b[j];
                checkBoards[i][j] = b[j];
            }
        }

        while (checkBlock(m, n)) {
            sortBlock(m, n);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (boards[i][j].equals("*")) {
                    answer++;
                }
            }
        }
        return answer;
    }

    /**
     * 없어진 블록 정리
     */
    private void sortBlock(int m, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (checkBoards[j][i].equals("*")) {
                    int idx = j - 1;
                    while (true) {
                        if (idx < 0) {
                            break;
                        }
                        if (!checkBoards[idx][i].equals("*")) {
                            checkBoards[j][i] = checkBoards[idx][i];
                            checkBoards[idx][i] = "*";
                            break;
                        }
                        idx--;
                    }
                }
            }
        }
        deepCopy();
    }

    /**
     * 없앨 블록을 체크한다.
     * @return true : 없앨 블록이 존재 O false : 없앨 블록 존재X
     */
    private boolean checkBlock(int m, int n) {
        boolean flag = false;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                String block = boards[i][j];
                if (block.equals("*") || !(block.charAt(0) >= 'A' && block.charAt(0) <= 'Z')) {
                    continue;
                }
                String lBlock = boards[i][j - 1];
                String uBlock = boards[i - 1][j];
                String luBlock = boards[i - 1][j - 1];

                if (block.equals(lBlock) && block.equals(uBlock) && block.equals(luBlock)) {
                    checkBoards[i][j] = "*";
                    checkBoards[i][j - 1] = "*";
                    checkBoards[i - 1][j] = "*";
                    checkBoards[i - 1][j - 1] = "*";
                    flag = true;
                }
            }
        }
        return flag;
    }

    /**
     * 배열 깊은 복사
     */
    public void deepCopy() {
        for (int i = 0; i < boards.length; i++) {
            System.arraycopy(checkBoards[i], 0, boards[i], 0, boards[0].length);
        }
    }
}