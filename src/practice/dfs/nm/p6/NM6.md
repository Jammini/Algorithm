# N과 M (6)

### 문제

N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.

- N개의 자연수 중에서 M개를 고른 수열
- 고른 수열은 오름차순이어야 한다.

### 입력

첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.

### 출력

한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

### 예제 입력 1
```text
3 1
4 5 2
```

### 예제 출력 1
```text
2
4
5
```

### 예제 입력 2
```text
4 2
9 8 7 1
```

### 예제 출력 2
```text
1 7
1 8
1 9
7 8
7 9
8 9
```

### 예제 입력 3
```text
4 4
1231 1232 1233 1234
```

### 예제 출력 3
```text
1231 1232 1233 1234
```
### 문제 풀이
```java

public class NM6 {
    int[] arr;

    public void solution(int N, int M, int[] nums) {
        arr = new int[M];
        Arrays.sort(nums);
        dfs(N, M, 0, 0, nums);
    }

    private void dfs(int N, int M, int index, int L, int[] nums) {
        if (L == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < N; i++) {
            arr[L] = nums[i];
            dfs(N, M, i + 1, L + 1, nums);
        }
    }

    public static void main(String[] args) {
        new NM6().solution(3, 1, new int[]{4, 5, 2});
        new NM6().solution(4, 2, new int[]{9, 8, 7, 1});
        new NM6().solution(4, 4, new int[]{1231, 1232, 1233, 1234});
    }
}

```