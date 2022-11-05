package programmers.p77885;

public class Solution {

    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            int count = 0;
            while (numbers[i] % 2 != 0) {
                count++;
                numbers[i] /= 2;
            }

            if (count == 0) {
                answer[i] = num + 1;
            } else {
                answer[i] = (long) (num + Math.pow(2, (count - 1)));
            }
        }
        return answer;

        /*for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];

            StringBuilder sb = new StringBuilder();
            while (numbers[i] != 0) {
                if (numbers[i] % 2 == 1) {
                    sb.insert(0, 1);
                } else {
                    sb.insert(0,0);
                }
                numbers[i] = numbers[i] / 2;
            }
            sb.insert(0, 0);
            String str = sb.toString();

            int number = Integer.parseInt(str.substring(str.lastIndexOf("0")), 2);
            int index = 0;
            while (true) {
                String str1 = Integer.toBinaryString((number ^ (number + ++index)));
                int cnt = 0;
                char[] chars = str1.toCharArray();

                for (int j = chars.length - 1; j >= 0; j--) {
                    if (chars[j] == '1') {
                        cnt++;
                    }
                    if (cnt > 2) {
                        break;
                    }
                }
                if (cnt <= 2) {
                    break;
                }
            }
            answer[i] = num + index;
        }*/
    }
    /*public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            while (true) {
                String str = Integer.toBinaryString((int) (numbers[i] ^ ++num));
                int cnt = 0;
                char[] chars = str.toCharArray();

                for (int j = chars.length - 1; j >= 0; j--) {
                    if (chars[j] == '1') {
                        cnt++;
                    }
                    if (cnt > 2) {
                        break;
                    }
                }
                if (cnt <= 2) {
                    break;
                }
            }
            answer[i] = num;
        }
        return answer;
    }*/
}
