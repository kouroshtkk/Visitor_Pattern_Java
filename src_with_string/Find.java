package src_with_string;

public class Find implements Visitor<Boolean> {

    private final String elem;

    public Find(String value) {
        this.elem = value;
    }

    @Override
    public Boolean visitEmpty() {
        return false;
    }

    @Override
    public Boolean visitNonEmpty(String label, BinTree left, BinTree right) {
        return label.equals(this.elem) || left.accept(this) || right.accept(this);
    }
}
