package leetcode.P1528;

public class Solution {
    public String restoreString(String s, int[] indices) {
        int a=0;
        int i=0;
        StringBuilder sb = new StringBuilder();

        while(a < indices.length){
            if(indices[i] == a){
                sb.append(s.charAt(i));
                a++;
                i = 0;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
