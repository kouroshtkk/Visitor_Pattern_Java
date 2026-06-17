package java_entity;

public interface JavaEntity {
    <T> T accept(Visitor<T> v);
}
