package practice.implementation.p6;

class Solution {

    int getIndex(int[] fruit) {
        int min = getMin(fruit);
        for (int i = 0; i < fruit.length; i++) {
            if (min == fruit[i]) {
                return i;
            }
        }
        return -1;
    }

    int getMin(int[] fruit) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < fruit.length; i++) {
            min = Math.min(min, fruit[i]);
        }
        return min;
    }

    boolean isUnique(int[] fruit) {
        int count = 0;
        int min = getMin(fruit);

        for (int i = 0; i < fruit.length; i++) {
            if (min == fruit[i]) {
                count++;
            }
        }
        return count != 1;
    }

    public int solution(int[][] fruit) {
        int answer = 0;
        int[] check = new int[fruit.length];

        for (int i = 0; i < fruit.length; i++) {
            if (check[i] == 1) {
                continue;
            }
            if (isUnique(fruit[i])) {
                continue;
            }
            for (int j = i + 1; j < fruit.length; j++) {
                if (check[j] == 1) {
                    continue;
                }
                if (isUnique(fruit[j])) {
                    continue;
                }
                int peopleA = getIndex(fruit[i]);
                int peopleB = getIndex(fruit[j]);
                if (peopleA != peopleB && fruit[i][peopleA] > 0 && fruit[j][peopleB] > 0) {

                    if (fruit[i][peopleA] + 1 <= fruit[i][peopleB] - 1 && fruit[j][peopleB] + 1 <= fruit[j][peopleA] - 1) {
                        fruit[i][peopleA]++;
                        fruit[i][peopleB]--;
                        fruit[j][peopleB]++;
                        fruit[j][peopleA]--;
                        check[i] = 1;
                        check[j] = 1;
                        break;
                    }
                }

            }
        }

        for (int[] f : fruit) {
            int min = getMin(f);
            answer += min;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
        System.out.println(T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));
        System.out.println(T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
        System.out.println(T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
    }
}