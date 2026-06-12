public class Increment implements Visitor<BinTree> {

    // (a) definire il metodo BinTree visitEmpty() della classe Increment;
    @Override
    public BinTree visitEmpty() {
        return new EmptyTree();
    }

    // (b) definire il metodo BinTree visitNonEmpty(int label, BinTree left, BinTree right) della classe Increment;
    @Override
    public BinTree visitNonEmpty(int label, BinTree left, BinTree right) {
        int newLabel = label+1;
        BinTree newLeft = left.accept(this);
        BinTree newRight = right.accept(this);
        return new NonEmptyTree(newLabel,newLeft,newRight);
    }
}
