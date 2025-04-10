package programmers.p258712;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] arr = new int[friends.length][friends.length];
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        // 선물 주고 받은 표 작성
        for(String gift : gifts) {
            String[] g = gift.split(" ");
            String sender = g[0];
            String receiver = g[1];
            arr[map.get(sender)][map.get(receiver)] = arr[map.get(sender)][map.get(receiver)] + 1;
        }

        // 선물 지수 map에 저장
        for(int i = 0; i < arr.length; i++) {
            int receiveCount = 0;
            int sendCount = 0;
            for(int j = 0; j < arr.length; j++) {
                sendCount += arr[i][j];
                receiveCount += arr[j][i];
            }
            map.put(friends[i], sendCount - receiveCount);
        }

        // 선물 계산
        for(int i = 0; i < arr.length; i++) {
            int num = 0;
            for(int j = 0; j < arr.length; j++) {
                if(i == j) {
                    continue;
                }

                if(arr[i][j] > arr[j][i]) {
                    num++;
                } else if(arr[i][j] == arr[j][i]) {
                    if(map.get(friends[i]) > map.get(friends[j])) {
                        num++;
                    }
                }
                answer = Math.max(answer, num);
            }
        }
        return answer;
    }
}
