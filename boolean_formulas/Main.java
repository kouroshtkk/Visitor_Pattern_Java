public class Main {
    public static void main(String[] args) {
        var trueLit = new BoolLiteral(true);
        var falseLit = new BoolLiteral(false);
        var impl = new ImplicationOp(trueLit, falseLit);
        var neg = new NegationOp(impl);

        // Test Eval
        assert !impl.accept(new Eval());
        assert neg.accept(new Eval());
        
        System.out.println("Tutti i test per Eval sono passati con successo!");
    }
}
