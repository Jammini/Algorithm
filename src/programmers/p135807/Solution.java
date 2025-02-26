package programmers.p135807;

public class Solution {

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % gcdA == 0) {
                gcdA = 0;
                break;
            }
        }

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % gcdB == 0) {
                gcdB = 0;
                break;
            }
        }

        answer = (gcdA > gcdB) ? gcdA : gcdB;
        return answer;
    }

    public int getGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
