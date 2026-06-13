package src_with_string;

public interface BinTree {
    <T> T accept(Visitor<T> v);
}
