package java_entity;

public class Main {
    public static void main(String[] args) {
        var instance1 = new InstanceEntity();
        var instance2 = new InstanceEntity();
        var class1 = new ClassEntity("C1", instance1);
        var class2 = new ClassEntity("C2", instance2);
        var class3 = new ClassEntity("C3", class1, class2);

        assert class3.accept(new SuperClassOf(class3)); // class3 è super-classe di se stessa
        assert class3.accept(new SuperClassOf(class1)); // class3 è super-classe di class1
        assert class3.accept(new SuperClassOf(class2)); // class3 è super-classe di class2
        assert !class1.accept(new SuperClassOf(class3)); // class1 non è super-classe di class3
        assert !class1.accept(new SuperClassOf(class2)); // class1 non è super-classe di class2
        
        // un oggetto non può essere una super-classe
        assert !instance1.accept(new SuperClassOf(class3));
        
        System.out.println("Tutti i test per SuperClassOf sono passati con successo!");
    }
}
