package practice.greedy.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int time;
    char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}

public class Main {
    public int solution(List<Time> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;

        for (Time ob : arr) {
            if (ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            arr.add(new Time(start, 's'));
            arr.add(new Time(end, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
