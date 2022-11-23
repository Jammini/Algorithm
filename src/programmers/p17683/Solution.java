package programmers.p17683;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        List<MusicInfo> list = new ArrayList<>();
        m = substitution(m);

        for (String musicinfo : musicinfos) {
            String[] tmp = musicinfo.split(",");
            list.add(new MusicInfo(tmp[0], tmp[1], substitution(tmp[2]), substitution(tmp[3])));
        }

        SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
        for (MusicInfo info : list) {
            try {
                Date d1 = f.parse(info.start);
                Date d2 = f.parse(info.end);
                long diffMinute = (d2.getTime() - d1.getTime()) / (1000 * 60);
                if (info.melody.length() < diffMinute) {
                    while (info.melody.length() < diffMinute) {
                        info.melody = info.melody + info.melody;
                    }
                }
                info.melody = info.melody.substring(0, (int) diffMinute);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        int max = 0;
        String titleMax = "";
        for (MusicInfo musicInfo : list) {
            if (musicInfo.melody.contains(m)) {
                if (max < musicInfo.melody.length()) {
                    max = musicInfo.melody.length();
                    titleMax = musicInfo.title;
                }
            }
        }
        if (!"".equals(titleMax)) {
            answer = titleMax;
        }
        return answer;
    }

    private String substitution(String m) {
        m = m.replace("C#", "c").replace("D#", "d")
                .replace("F#", "f").replace("G#", "g").replace("A#", "a");
        return m;
    }
}

class MusicInfo {
    String start;
    String end;
    String title;
    String melody;

    public MusicInfo(String start, String end, String title, String melody) {
        this.start = start;
        this.end = end;
        this.title = title;
        this.melody = melody;
    }
}