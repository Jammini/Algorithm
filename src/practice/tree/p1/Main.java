package practice.tree.p1;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public void solution(Node root) {
        if (root == null) {
            return;
        } else {
//            System.out.print(root.data + " "); // 전위 순회
            solution(root.lt);
//            System.out.print(root.data + " "); // 중위 순회
            solution(root.rt);
//            System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.solution(tree.root);
    }
}
