package java_entity;

public class SuperClassOf implements Visitor<Boolean> {
    private final ClassEntity classEntity;

    // (b) completare il costruttore della classe SuperClassOf.
    public SuperClassOf(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    // (c) completare il metodo visitClassEntity della classe SuperClassOf.
    @Override
    public Boolean visitClassEntity(String name, JavaEntity... entities) {
        if (this.classEntity.getName().equals(name)) {
            return true;
        }
        for (JavaEntity e : entities) {
            if (e.accept(this)) {
                return true;
            }
        }
        return false;
    }

    // (b) completare il metodo visitInstanceEntity della classe SuperClassOf.
    @Override
    public Boolean visitInstanceEntity() {
        return false;
    }
}
