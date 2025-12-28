package leetcode.p1574;

public class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;

        while(left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }

        if(left ==  n - 1) {
            return 0;
        }

        int right = n - 1;
        while(right > left && arr[right - 1] <= arr[right]) {
            right--;
        }

        // 왼쪽을 자르거나, 오른쪽을 잘랐을때 작은 값
        int result = Math.min(n - left - 1, right);

        // 가운데 merge 할 때 값을 구한다.
        int i = 0;
        int j = right;
        while(i <= left && j < n) {
            if(arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
