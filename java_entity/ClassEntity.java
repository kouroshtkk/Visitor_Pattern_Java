package java_entity;

import static java.util.Objects.requireNonNull;

public class ClassEntity implements JavaEntity {
    private final String name;
    private final JavaEntity[] entities; // instances or subclasses

    // (a) completare il costruttore e il metodo accept della classe ClassEntity.
    public ClassEntity(String name, JavaEntity... entities) { // shallow copy
        this.name = requireNonNull(name);
        this.entities = requireNonNull(entities);
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitClassEntity(name, entities);
    }

    public String getName() {
        return name;
    }
}
