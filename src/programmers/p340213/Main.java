package programmers.p340213;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().solution("34:33", "13:00","00:55",	"02:55", new String[]{"next", "prev"})); // "13:00"
        System.out.println(new Solution().solution("10:55", "00:05","00:15",	"06:55", new String[]{"prev", "next", "next"})); // "06:55"
        System.out.println(new Solution().solution("07:22", "04:05","00:15",	"04:07", new String[]{"next"})); // "04:17"
    }
}
