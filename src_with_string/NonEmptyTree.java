package src_with_string;

public class NonEmptyTree implements BinTree {
    private final String label;
    private final BinTree left;
    private final BinTree right;

    public NonEmptyTree(String label, BinTree left, BinTree right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitNonEmpty(label, left, right);
    }
}
