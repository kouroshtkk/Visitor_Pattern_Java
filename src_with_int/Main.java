public class Main {
    public static void main(String[] args) {
        var emptyT = new EmptyTree();
        var t1 = new NonEmptyTree(3, 
            new NonEmptyTree(2,
                new NonEmptyTree(1, emptyT, emptyT), emptyT), 
            new NonEmptyTree(4, emptyT, emptyT));

        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");


        // Test Increment
        var t2 = t1.accept(new Increment());
        System.out.println("Increment completato senza errori.");



        // Test LessThan
        boolean testLess1 = t1.accept(new LessThan(5)); // dovrebbe essere true (tutti < 5)
        boolean testLess2 = t1.accept(new LessThan(4)); // dovrebbe essere false (il nodo 4 non è < 4)
        
        assert testLess1 && !testLess2 : "Test LessThan fallito!";
        System.out.println("Test LessThan passato con successo!");
    }
}
