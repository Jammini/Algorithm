package leetcode.p84;

class Solution {
    public int largestRectangle(int[] heights) {
        int answer = 0;
        int left =0;
        int leftwidth =0;
        int right=0;
        int rightwidth =0;
        int area = 0;

        for(int i = 0; i < heights.length; i++) {
            area = 0;
            leftwidth=0;
            left = i;

            while(heights[i] <= heights[left]) {
                leftwidth++;
                if(left ==0) {
                    break;
                }
                left--;
            }

            right = i;
            rightwidth=0;
            while(heights[i] <= heights[right]) {
                rightwidth++;
                if(right ==heights.length-1) {
                    break;
                }
                right++;
            }
            area = (leftwidth + rightwidth -1) * heights[i];

            if(area > answer) {
                answer =area;
            }
        }
        return answer;
    }
}