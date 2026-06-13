public class Eval implements Visitor<Boolean> { 

    @Override
    public Boolean visitBoolLiteral(boolean value){
        return value;
    }

    @Override
    public Boolean visitNegationOp(FormulaAST value){
        return !value.accept(this);
    }

    @Override
    public Boolean visitImplicationOp(FormulaAST value,FormulaAST value2){
        return !value.accept(this) || value2.accept(this); 
    }
}
