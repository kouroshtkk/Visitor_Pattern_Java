package src_with_string;

public class Main {
    public static void main(String[] args) {
        var emptyT = new EmptyTree();
        var t1 = new NonEmptyTree("c", 
            new NonEmptyTree("b",
                new NonEmptyTree("a", emptyT, emptyT), emptyT), 
            new NonEmptyTree("d", emptyT, emptyT));

        System.out.println("Setup completo. Rimuovi i commenti sotto per testare le tue implementazioni:");


        // Test ToUpperCase
        var t2 = t1.accept(new ToUpperCase());
        System.out.println("ToUpperCase completato senza errori.");



        // Test Find
        boolean testFind1 = t1.accept(new Find("e")); // dovrebbe essere false
        boolean testFind2 = t1.accept(new Find("d")); // dovrebbe essere true
        
        assert !testFind1 && testFind2 : "Test Find fallito!";
        System.out.println("Test Find passato con successo!");
        }
}
