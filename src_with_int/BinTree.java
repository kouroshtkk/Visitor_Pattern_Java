package src_with_int;

public interface BinTree {
    <T> T accept(Visitor<T> v);
}
