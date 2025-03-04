package programmers.p172928;

public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] startPoint = findStartPoint(park);

        String[][] parkArray = new String[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            parkArray[i] = park[i].split("");
        }

        for (String route : routes) {
            String[] split = route.split(" ");
            String direction = split[0];
            int distance = Integer.parseInt(split[1]);

            if (direction.equals("N") && startPoint[0] - distance >= 0) {
                boolean isPossible = true;
                for (int i = 1; i <= distance; i++) {
                    if (parkArray[startPoint[0] - i][startPoint[1]].equals("X")) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    startPoint[0] -= distance;
                }
            } else if (direction.equals("S") && startPoint[0] + distance < parkArray.length) {
                boolean isPossible = true;
                for (int i = 1; i <= distance; i++) {
                    if (parkArray[startPoint[0] + i][startPoint[1]].equals("X")) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    startPoint[0] += distance;
                }
            } else if (direction.equals("W") && startPoint[1] - distance >= 0) {
                boolean isPossible = true;
                for (int i = 1; i <= distance; i++) {
                    if (parkArray[startPoint[0]][startPoint[1] - i].equals("X")) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    startPoint[1] -= distance;
                }
            } else if (direction.equals("E") && startPoint[1] + distance < parkArray[0].length) {
                boolean isPossible = true;
                for (int i = 1; i <= distance; i++) {
                    if (parkArray[startPoint[0]][startPoint[1] + i].equals("X")) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    startPoint[1] += distance;
                }
            }
        }
        return startPoint;
    }

    private int[] findStartPoint(String[] park) {
        int[] startPoint = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    startPoint[0] = i;
                    startPoint[1] = j;
                    return startPoint;
                }
            }
        }
        return startPoint;
    }
}
