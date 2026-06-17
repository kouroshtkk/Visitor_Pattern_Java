package java_entity;

public class InstanceEntity implements JavaEntity {
    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitInstanceEntity();
    }
}
