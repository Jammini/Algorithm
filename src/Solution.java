import java.util.HashSet;

public class Solution {

    public static int solution(int[] A, int S) {
        int answer = 0;

        int addTmp = 0;

        if(A ==null || A.length == 0){
            return 0;
        }

        for (int i = 0; i < A.length; i++) {
            addTmp = A[i];
            for (int j = i + 1; j < A.length; j++) {
                addTmp += A[j];
                if (addTmp == S) {
                    answer++;
                    break;
                }
            }

        }

        return answer;
        /*int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < flowers.length; i++) {
            for (int j = flowers[i][0]; j < flowers[i][1]; j++) {
                if (!set.contains(j)) {
                    set.add(j);
                }

            }
        }
        answer = set.size();

        return answer;*/

    }


    public static void main(String[] args) {

        int[] A = null;
        int S = 3;

        System.out.println(solution(A, S));


        /*int[][] A = {{2, 5}, {3, 7}, {10, 11}};
        int[][] B = {{3, 4}, {4, 5}, {6, 7}, {8, 10}};

        System.out.println(solution(A));
        System.out.println(solution(B));*/
    }
}

/*import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

public class Solution {

    public static List<String> commonChars(String[] A) {

        List<String> result = new ArrayList<String>();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < A[0].length(); i++) {
            if (map.containsKey(A[0].charAt(i))) {
                map.put(A[0].charAt(i), map.get(A[0].charAt(i)) + 1);
            } else {
                map.put(A[0].charAt(i), 1);
            }
        }

        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
            for (int j = 0; j < A[i].length(); i++) {
                if (map.containsValue(A[i].charAt(j)) && map.get((A[i].charAt(j))) > 0 ) {
                    if (map2.containsKey(A[0].charAt(i))) {
                        map2.put(A[0].charAt(i), map2.get(A[0].charAt(i)) + 1);
                    } else {
                        map2.put(A[0].charAt(i), 1);
                    }
                    map.replace(A[i].charAt(j), map.get(A[i].charAt(j)-1));
                }
            }

        }

        return result;
    }


    public static void main(String[] args) {

        String[] A = {"bella", "label", "roller"};
        String[] B = {"cool", "lock", "cook"};

        System.out.println(commonChars(A));
        System.out.println(commonChars(B));
    }
}*/

/*public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode resultNode = new ListNode();
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode tmp = head;
        head = head.next;
        head.next = tmp;

        resultNode = head;

        resultNode.next.next = swapPairs(head.next.next);

        return head;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        s.swapPairs(node1);
    }
}*/

/*import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

public class Solution {

    public static List<String> commonChars(String[] A) {

        List<String> result = new ArrayList<String>();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < A[0].length(); i++) {
            if (map.containsKey(A[0].charAt(i))) {
                map.put(A[0].charAt(i), map.get(A[0].charAt(i)) + 1);
            } else {
                map.put(A[0].charAt(i), 1);
            }
        }

        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
            for (int j = 0; j < A[i].length(); i++) {
                if (map.containsValue(A[i].charAt(j)) && map.get((A[i].charAt(j))) > 0 ) {
                    if (map2.containsKey(A[0].charAt(i))) {
                        map2.put(A[0].charAt(i), map2.get(A[0].charAt(i)) + 1);
                    } else {
                        map2.put(A[0].charAt(i), 1);
                    }
                    map.replace(A[i].charAt(j), map.get(A[i].charAt(j)-1));
                }
            }

        }

        return result;
    }


    public static void main(String[] args) {

        String[] A = {"bella", "label", "roller"};
        String[] B = {"cool", "lock", "cook"};

        System.out.println(commonChars(A));
        System.out.println(commonChars(B));
    }
}*/

/*public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode resultNode = new ListNode();
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode tmp = head;
        head = head.next;
        head.next = tmp;

        resultNode = head;

        resultNode.next.next = swapPairs(head.next.next);

        return head;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        s.swapPairs(node1);
    }
}*/

/*import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

public class Solution {

    public static List<String> commonChars(String[] A) {

        List<String> result = new ArrayList<String>();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < A[0].length(); i++) {
            if (map.containsKey(A[0].charAt(i))) {
                map.put(A[0].charAt(i), map.get(A[0].charAt(i)) + 1);
            } else {
                map.put(A[0].charAt(i), 1);
            }
        }

        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
            for (int j = 0; j < A[i].length(); i++) {
                if (map.containsValue(A[i].charAt(j)) && map.get((A[i].charAt(j))) > 0 ) {
                    if (map2.containsKey(A[0].charAt(i))) {
                        map2.put(A[0].charAt(i), map2.get(A[0].charAt(i)) + 1);
                    } else {
                        map2.put(A[0].charAt(i), 1);
                    }
                    map.replace(A[i].charAt(j), map.get(A[i].charAt(j)-1));
                }
            }

        }

        return result;
    }


    public static void main(String[] args) {

        String[] A = {"bella", "label", "roller"};
        String[] B = {"cool", "lock", "cook"};

        System.out.println(commonChars(A));
        System.out.println(commonChars(B));
    }
}*/

/*public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode resultNode = new ListNode();
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode tmp = head;
        head = head.next;
        head.next = tmp;

        resultNode = head;

        resultNode.next.next = swapPairs(head.next.next);

        return head;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        s.swapPairs(node1);
    }
}*/




