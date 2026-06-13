package boolean_formulas;

import java.util.Objects;

// operatore di negazione
public class NegationOp implements FormulaAST {
    private final FormulaAST value;
    public NegationOp(FormulaAST value){
        this.value = Objects.requireNonNull(value);
    }
    public <T> T accept(Visitor<T> v) { return v.visitNegationOp(this.value);}
}
