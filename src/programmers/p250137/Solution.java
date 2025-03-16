package programmers.p250137;

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int hp = health;
        int second = attacks[attacks.length - 1][0];
        int index = 0;
        int count = 0;

        for(int i = 1; i <= second; i++) {
            if (health <= 0) {
                return -1;
            }

            if (attacks[index][0] == i) { // attack
                health -= attacks[index][1];
                count = 0;
                index++;
                continue;
            }
            count++;

            if (count % bandage[0] == 0) {
                health += bandage[2];
            }
            health += bandage[1];

            if (health >= hp) {
                health = hp;
            }
        }

        if (health <= 0) {
            return -1;
        }
        return health;
    }
}
