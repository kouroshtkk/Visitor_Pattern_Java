package boolean_formulas;

// costanti booleane
public class BoolLiteral implements FormulaAST { 
    private final boolean value;
    public BoolLiteral(boolean value){
        this.value = value;
    }
    @Override
    public <T> T accept(Visitor<T> v) { return v.visitBoolLiteral(this.value);}
}
