package list_exp;

public class Length implements Visitor<Integer> {
    private int length;
    // (c) completare i metodi visitEmptyList e visitListCons della classe Length.
    @Override
    public Integer visitListCons(Exp head, ListExp tail) {
        return 1+tail.accept(this);
    }

    @Override
    public Integer visitEmptyList() {
        return 0;
    }
}
