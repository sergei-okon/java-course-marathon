package day18;

class Tree {
    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int x) {
        }
    }

    private Node root;

    public void insert(int x) {
        Node parent = null;
        Node node = root;
        while (node != null) {
            parent = node;
            if (x < node.key) {
                node = node.left;
            } else if (x > node.key) {
                node = node.right;
            } else {
                return;
            }
        }

        Node newNode = new Node(x);

        if (parent == null) {
            root = newNode;
        } else if (x < parent.key) {
            parent.left = newNode;
        } else if (x > parent.key) {
            parent.right = newNode;
        }
    }
}
