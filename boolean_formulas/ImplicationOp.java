import java.util.Objects;

// operatore di implicazione
public class ImplicationOp implements FormulaAST {
    private final FormulaAST value1, value2;
    public ImplicationOp(FormulaAST value1, FormulaAST value2){
        this.value1 = Objects.requireNonNull(value1);
        this.value2 = Objects.requireNonNull(value2);
    }
    @Override
    public <T> T accept(Visitor<T> v) { return v.visitImplicationOp(this.value1, this.value2);}
}
