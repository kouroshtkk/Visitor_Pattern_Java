package src_with_int;

public class Main {
    public static void main(String[] args) {
        var emptyT = new EmptyTree();
        var t1 = new NonEmptyTree(1, emptyT, emptyT);
        var t2 = new NonEmptyTree(2, t1, emptyT);
        var t4 = new NonEmptyTree(4, emptyT, emptyT);
        var t3 = new NonEmptyTree(3, t2, t4);

        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");

        // Test Increment
        var incrementedTree = t1.accept(new Increment());
        System.out.println("Increment completato senza errori.");

        // Test LessThan
        boolean testLess1 = t1.accept(new LessThan(5)); // dovrebbe essere true (tutti < 5)
        boolean testLess2 = t1.accept(new LessThan(1)); // dovrebbe essere false
        
        assert testLess1 && !testLess2 : "Test LessThan fallito!";
        System.out.println("Test LessThan passato con successo!");

        // Test InOrder
        assert t3.accept(new InOrder()).toString().equals("[1, 2, 3, 4]") : "Test InOrder fallito!";
        System.out.println("Test InOrder passato con successo!");
    }
}
