public class ToUpperCase implements Visitor<BinTree> {

    // (a) definire il metodo BinTree visitEmpty() della classe ToUpperCase
    @Override
    public BinTree visitEmpty() {
        return new EmptyTree();
    }

    // (b) definire il metodo BinTree visitNonEmpty(String label, BinTree left, BinTree right)
    @Override
    public BinTree visitNonEmpty(String label, BinTree left, BinTree right) {
       String newLabel = label.toUpperCase();
       BinTree newLeft = left.accept(this);
       BinTree newRight = right.accept(this);
       return new NonEmptyTree(newLabel,newLeft,newRight);
    }
}
