### N개의 최소공배수

---

https://school.programmers.co.kr/learn/courses/30/lessons/12953

#### 문제설명

두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의
최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

#### 제안사항

- arr은 길이 1이상, 15이하인 배열입니다.
- arr의 원소는 100 이하인 자연수입니다.

#### 입출력 예

| arr       | result |
|-----------|-------|
| [2,6,8,14] | 168   |
| [1,2,3]   | 6     |

#### 문제풀이

```java

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        boolean flag = true;
        Arrays.sort(arr);

        int cnt = 1;
        while (flag) {
            for (int i = 0; i < arr.length - 1; i++) {
                if ((arr[arr.length - 1] * cnt) % arr[i] != 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                flag = true;
                cnt++;
            } else {
                break;
            }
        }
        return arr[arr.length - 1] * cnt;
    }
}
```
