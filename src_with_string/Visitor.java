package src_with_string;

public interface Visitor<T> {
    T visitEmpty();
    T visitNonEmpty(String label, BinTree left, BinTree right);
}
