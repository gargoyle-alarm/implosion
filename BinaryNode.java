//@SuppressWarnings("unchecked")
public class BinaryNode {
    private Comparable thing;
    private BinaryNode left, right;
    
    public BinaryNode (Comparable j, BinaryNode k, BinaryNode l) {
        thing = j;
        left = k;
        right = l;
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
    
    public String toString() {
    	return thing + "";
    }
}


