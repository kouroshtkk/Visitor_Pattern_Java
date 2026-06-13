package src_with_int;

public interface Visitor<T> {
    T visitEmpty();
    T visitNonEmpty(int label, BinTree left, BinTree right);
}
