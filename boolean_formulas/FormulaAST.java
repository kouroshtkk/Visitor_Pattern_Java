public interface FormulaAST {
    <T> T accept(Visitor<T> v);
}
