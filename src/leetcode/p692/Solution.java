package leetcode.p692;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String , Integer> map = new HashMap<String , Integer>();


        for(int i=0; i< words.length; i++){

            map.put(words[i],map.getOrDefault(words[i],0) +1);

        }

        List<String> list = new ArrayList();
        list.addAll(map.keySet());

        Collections.sort(list, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        return list.subList(0,k);
    }
}