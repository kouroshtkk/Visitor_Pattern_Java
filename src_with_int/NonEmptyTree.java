public class NonEmptyTree implements BinTree {
    private final int label;
    private final BinTree left;
    private final BinTree right;

    public NonEmptyTree(int label, BinTree left, BinTree right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitNonEmpty(label, left, right);
    }
}
