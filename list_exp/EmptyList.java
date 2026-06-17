package list_exp;

public class EmptyList implements ListExp {
    // (a) completare il metodo accept della classe EmptyList.
    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitEmptyList();
    }
}
