package programmers.p84512;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*public int solution(String word) {
        int answer = 0;
        String[] dic = {"A", "E", "I", "O", "U"};
        StringBuilder sb = new StringBuilder();

        label:
        for (String s : dic) {
            answer++;
            sb.append(s);
            if (word.equals(sb.toString())) {
                break;
            }
            for (String value : dic) {
                answer++;
                sb.append(value);
                if (word.equals(sb.toString())) {
                    break label;
                }
                for (String item : dic) {
                    answer++;
                    sb.append(item);
                    if (word.equals(sb.toString())) {
                        break label;
                    }
                    for (String element : dic) {
                        answer++;
                        sb.append(element);
                        if (word.equals(sb.toString())) {
                            break label;
                        }
                        for (String s1 : dic) {
                            answer++;
                            sb.append(s1);
                            if (word.equals(sb.toString())) {
                                break label;
                            } else {a
                                sb.delete(sb.length() - 1, sb.length());
                            }
                        }
                        sb.delete(sb.length() - 1, sb.length());
                    }
                    sb.delete(sb.length() - 1, sb.length());
                }
                sb.delete(sb.length() - 1, sb.length());
            }
            sb.delete(sb.length() - 1, sb.length());
        }
        return answer;
    }*/
    List<String> list = new ArrayList<>();
    public int solution(String word) {
        dfs("", 0);
        return list.indexOf(word);
    }

    void dfs(String str, int len) {
        String[] dic = {"A", "E", "I", "O", "U"};
        if (len > 5) {
            return;
        }
        list.add(str);
        for (int i = 0; i < 5; i++) {
            dfs(str + dic[i], len + 1);
        }
    }
}
