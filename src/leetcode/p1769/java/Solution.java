package leetcode.p1769.java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        String[] box = boxes.split("");
        List<Integer> list = new ArrayList();

        for (int i = 0; i < box.length; i++) {
            if (box[i].equals("1")) {
                list.add(i);
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < list.size(); j++){
                System.out.println(Math.abs(i - list.get(j)));
                result[i] +=  Math.abs(i - list.get(j));
            }
        }
        return result;
    }
}
