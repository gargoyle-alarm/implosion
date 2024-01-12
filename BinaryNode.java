//@SuppressWarnings("unchecked")
public class BinaryNode {
    private Comparable thing;
    private BinaryNode left, right;
    
    public BinaryNode (Comparable j) {
        thing = j;
    }
    
    public Comparable get() {
        return thing;
    }
    
    public BinaryNode left() {
        return left;
    }
    
    public BinaryNode right() {
        return right;
    }
    
    public void setLeft(BinaryNode x) {
        left = x;
    }
    
    public void setRight(BinaryNode x) {
        right = x;
    }
    
    public String toString() {
    	return thing + "";
    }
}


