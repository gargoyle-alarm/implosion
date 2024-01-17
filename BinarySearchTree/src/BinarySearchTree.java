//@SuppressWarnings("unchecked")
public class BinarySearchTree {
    
	private BinaryNode root;
	
    public BinarySearchTree() {
    	root = null;
    }
    
    // -- TRAVERSALS --
	    
    	public String preOrder() {
			return null;
			// TO-DO 
	    }
	    
	    public String postOrder() {
			return null;
			// TO-DO 
	    }
	    
	    public String inOrder() {
			return null;
			// TO-DO 
	    }
	    
	    public String reverseOrder() {
	    	return null;
	    	// TO-DO
	    }
	    
	    public String levelOrder() {
			return null;
			// TO-DO 
	    }
    
	// -- GET DATA --
    
		public int numLeaves() {
	    	return -1;
	    	// TO-DO
	    }
	    
	    public int numLevels() {
	    	return -1;
	    	// TO-DO
	    }
	    
	    public int width() {
	    	return -1;
	    	// TO-DO 
	    }
	    
	    public int height() {
	    	return -1;
	    	// TO-DO 
	    	
	    }
	    
	    public int diameter() {
	    	return -1;
	    	// TO-DO 
	    	
	    }
	    
	    public int numNodes() {
	    	return -1;
	    	// TO-DO 
	    }
	    
	    public int eachWidth() {
	    	return -1;
	    	// TO-DO 
	    }
	    
	    public boolean isFull() {
	    	return false;
	    	// TO-DO 
	    }
	    
	    public boolean has(Comparable y) {
	    	return false;
	    	// TO-DO 
	    }
	    
	    public Comparable getLargest() {
	    	return null;
	    	// TO-DO 
	    }
	    
	    public Comparable getSmallest() {
	    	return null;
	    	// TO-DO 
	    }
    
	// -- tostring -- 
    public String toString() {
    	return "tree";
    	// TO-DO 
    }
    
    // -- TREE MODIFIERS --
    
    public BinaryNode remove(Comparable y) {
    	return null;
    	// TO-DO 
    }
    
    public void add(BinaryNode x)
    {
    	if(root == null)
    	{
    		root = x;
    		return;
    	}
    	add(root, x);
    }
    
    public void add(BinaryNode parent, BinaryNode x) {
    	if(parent == null) return;
    	if(x.getValue().compareTo(parent.getValue()) < 0)
			if(parent.left()==null)
				parent.setLeft(x);
			else
				add(parent.left(),x);
		else
			if(parent.right()==null)
				parent.setRight(x);
			else
				add(parent.right(),x);

    }

}
