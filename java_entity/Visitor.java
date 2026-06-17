package java_entity;

public interface Visitor<T> {
    T visitInstanceEntity();
    T visitClassEntity(String name, JavaEntity... entities);
}
