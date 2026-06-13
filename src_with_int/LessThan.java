package src_with_int;

public class LessThan implements Visitor<Boolean> {

    private final int lessThanValue;
    // (d) definire il costruttore LessThan(int i);
    public LessThan(int i) {
        this.lessThanValue = i;
    }

    // (e) definire il metodo Boolean visitEmpty() della classe LessThan;
    @Override
    public Boolean visitEmpty() {
        return true;
    }

    // (f) definire il metodo Boolean visitNonEmpty(int label, BinTree left, BinTree right) della classe LessThan;
    @Override
    public Boolean visitNonEmpty(int label, BinTree left, BinTree right) {
        return (label<this.lessThanValue)&& left.accept(this) && right.accept(this);
    }
}
