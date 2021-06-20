package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : numbers)
            addNode(number, root);

        dfs(root);
    }

    private static void dfs(Node node) {
        if (node == null)
            return;
        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    private static void addNode(int insertValue, Node root) {
        if (root == null)
            throw new IllegalArgumentException("Корневой узел должен быть не NULL");

        Node nextNode = root;
        Node current = null;

        while (nextNode != null) {
            current = nextNode;

            if (insertValue < current.getValue()) {
                nextNode = current.getLeft();
            } else {
                nextNode = current.getRight();
            }
        }
        if (insertValue < current.getValue()) {
            current.setLeft(new Node(insertValue));
        } else {
            current.setRight(new Node(insertValue));
        }
    }
}
