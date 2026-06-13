package src_with_string;

public class EmptyTree implements BinTree {
    
    public EmptyTree() {
    }

    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visitEmpty();
    }
}
