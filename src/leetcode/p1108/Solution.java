package leetcode.p1108;

public class Solution {
    public String defangIPaddr(String address) {

        // 첫 번째 풀이
        /*String answer ="";
        String[] str1 = address.split("\\.");

        for(int i=0; i<str1.length; i++){
            answer += str1[i];
            if(i != str1.length-1){
                answer += "[.]";
            }
        }
        return answer;*/

        // 두 번째 풀이
        StringBuilder sb = new StringBuilder();

        for(int i=0;i <address.length(); i++){
            if(address.charAt(i) == '.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}
