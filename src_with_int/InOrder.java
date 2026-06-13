package src_with_int;

import java.util.List;

public class InOrder implements Visitor<List<Integer>> {
    
    @Override
    public List<Integer> visitEmpty() {
        return new java.util.LinkedList<>();
    }

    @Override
    public List<Integer> visitNonEmpty(int label, BinTree left, BinTree right) {
        List<Integer> result = new java.util.LinkedList<>();
        
        List<Integer> leftList = left.accept(this);
        result.addAll(leftList);
        
        result.add(label);
        
        List<Integer> rightList = right.accept(this);
        result.addAll(rightList);
        
        return result;
    }
}