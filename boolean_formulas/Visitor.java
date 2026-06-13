public interface Visitor<T> {
    T visitBoolLiteral(boolean value);
    T visitNegationOp(FormulaAST exp);
    T visitImplicationOp(FormulaAST left, FormulaAST right);
}
