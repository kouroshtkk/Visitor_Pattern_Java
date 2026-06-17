package list_exp;

public interface Visitor<T> {
    T visitEmptyList();
    T visitListCons(Exp head, ListExp tail);
}
