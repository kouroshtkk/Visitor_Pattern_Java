package list_exp;

public interface Exp {
    <T> T accept(Visitor<T> v);
}
