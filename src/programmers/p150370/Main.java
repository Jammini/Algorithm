package programmers.p150370;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"},
            new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}))); // [1, 3]
        System.out.println(Arrays.toString(new Solution().solution("2020.01.01", new String[]{"Z 3", "D 5"},
            new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}))); // [1, 4, 5]
    }
}
