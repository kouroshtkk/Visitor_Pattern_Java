public interface BinTree {
    <T> T accept(Visitor<T> v);
}
