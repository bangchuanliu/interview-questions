package common;

public class BNode<Key extends Comparable<Key>, Value> {

    public Key key;

    public Value value;

    public BNode left;

    public BNode right;

    public BNode(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}
