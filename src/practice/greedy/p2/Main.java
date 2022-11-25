package practice.greedy.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start;
    int end;

    Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.start;
        } else {
            return this.end - o.end;
        }
    }
}

public class Main {
    public int solution(List<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);

        int et = 0;
        for (Time time : arr) {
            if (et <= time.start) {
                et = time.end;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            arr.add(new Time(start, end));
        }
        System.out.println(T.solution(arr, n));
    }
}
