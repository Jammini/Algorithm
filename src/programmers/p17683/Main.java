package programmers.p17683;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})); // "HELLO"
        System.out.println(s.solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})); // "FOO"
        System.out.println(s.solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})); // "WORLD"
        System.out.println(s.solution("ABC", new String[]{"12:00,12:06,HELLO,ABC#ABC#ABC"})); // "(None)"
        System.out.println(s.solution("ABC", new String[]{"12:00,12:10,HELLO,ABC#ABC#ABC"})); // "HELLO"
        System.out.println(s.solution("ABC", new String[]{"12:04,13:00,HELLO,ABC#ABC#ABC"})); // "HELLO"
        System.out.println(s.solution("C#C", new String[]{"12:00,12:06,HELLO,C#C#CC#"})); // "HELLO"
        System.out.println(s.solution("CCB", new String[]{"03:00,03:10,FOO,CCB#CCB", "04:00,04:08,BAR,ABC"})); // "HELLO"
    }
}
