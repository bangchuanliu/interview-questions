package common;

public class BST<Key extends Comparable<Key>, Value> {

    private BNode root;

    public Value get(Key key) {
        BNode node = root;
        while (node != null) {
            int cmp = node.key.compareTo(key);
            if (cmp < 0) {
                node = node.left;
            } else if (cmp > 0) {
                node = node.right;
            } else {
                return (Value) node.value;
            }
        }
        return null;
    }

    public void insert(Key key, Value value) {
        root = insert(root, key, value);
    }

    private BNode insert(BNode node, Key key, Value value) {
        if (node == null) {
            return new BNode(key, value);
        }
        int cmp = node.key.compareTo(key);
        if (cmp > 0) {
            node.left = insert(node.left, key, value);
        } else if (cmp < 0) {
            node.right = insert(node.right, key, value);
        } else {
            return node;
        }
        return node;
    }

    public BNode delete() {
        //TODO
        return null;
    }
}
