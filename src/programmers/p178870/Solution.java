package programmers.p178870;

public class Solution {
    public int[] solution(int[] sequence, int k) {
        int sum = 0;
        int left = 0;
        int lt = 0;
        int rt = 0;
        int dis = Integer.MAX_VALUE;

        for (int right = 0; right < sequence.length; right++) {
            sum += sequence[right];
            if (sum == k && dis > right - left) {
                lt = left;
                rt = right;
                dis = right - left;
            }
            while (sum >= k) {
                sum -= sequence[left++];
                if (sum == k && dis > right - left) {
                    lt = left;
                    rt = right;
                    dis = right - left;
                }
            }
        }
        return new int[]{lt, rt};
    }
}
