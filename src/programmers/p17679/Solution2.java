package programmers.p17679;

class Solution2 {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        String tmp[][] = new String[m][n];
        String result[][] = new String[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                tmp[i][j] = board[i].substring(j,j+1);
                result[i][j] = board[i].substring(j,j+1);
            }
        }

        while(true){
            int count=0;

            for(int i=0; i<m-1; i++) {
                for(int j=0; j<n-1; j++) {
                    if(tmp[i][j].equals(tmp[i][j+1]) && tmp[i][j].equals(tmp[i+1][j]) && tmp[i][j].equals(tmp[i+1][j+1]) && !tmp[i][j].equals("a")) {
                        result[i][j] = "a";
                        result[i][j+1] = "a";
                        result[i+1][j] = "a";
                        result[i+1][j+1] = "a";
                        count++;
                    }
                }
            }

            for(int i=0; i<n; i++) {
                for(int j=m-2; j >= 0; j--) {
                    for(int k= j; k < m-1; k++) {
                        String word = result[k+1][i];
                        if(word.equals("a")) {
                            result[k+1][i] = result[k][i];
                            result[k][i] = word;
                        }

                    }
                }
            }
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    tmp[i][j] = result[i][j];
                }
            }

            if(count==0) {
                break;
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(tmp[i][j].equals("a")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}