//@SuppressWarnings("unchecked")

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    
	private BinaryNode root;
	
    public BinarySearchTree() {
    	root = null;
    }
    
    // -- TRAVERSALS --
	    
    	public String preOrder() {
			return preOrder(root).trim();
	    }
    	
    	private String preOrder(BinaryNode k)
    	{
    		String temp = "";
    		if(k != null)
    		{
    			// use value
    			temp += k.getValue()+ " ";
    			// go left
    			temp += preOrder(k.left());
    			// go right
    			temp += preOrder(k.right());
    		}
    		return temp;
    	}

	    
	    public String postOrder() {
			return postOrder(root).trim();
	    }
	    
	    private String postOrder(BinaryNode k) {
	    	String temp = "";
    		if(k != null)
    		{
    			// go left
    			temp += preOrder(k.left());
    			// go right
    			temp += preOrder(k.right());
    			// use value
    			temp += k.getValue()+ " ";
    		}
    		return temp;
	    }
	    
	    public String inOrder() {
			return inOrder(root).trim();
	    }
	    
	    public String inOrder(BinaryNode k) {
	    	String temp = "";
    		if(k != null)
    		{
    			// go left
    			temp += preOrder(k.left());
    			// use value
    			temp += k.getValue()+ " ";
    			// go right
    			temp += preOrder(k.right());
    		}
    		return temp;
	    }
	    
	    public String reverseOrder() {
	    	return reverseOrder(root);
	    }
	    
	    public String reverseOrder(BinaryNode k) {
	    	String temp = "";
    		if(k != null)
    		{
    			// go right
    			temp += preOrder(k.right());
    			// use value
    			temp += k.getValue()+ " ";
    			// go left
    			temp += preOrder(k.left());
    		}
    		return temp;
	    }
	    
	    public String levelOrder() {
	    	String temp = "";
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.offer(root);
			while(!queue.isEmpty()) 
			{
				BinaryNode k = queue.poll();
				temp += k.getValue()+" ";
				if(k.left()!=null)
					queue.offer(k.left());
				if(k.right()!=null)
					queue.offer(k.right());
			}
			return temp.trim();

	    }
    
	// -- GET DATA --
    
		public int numNodes() {
			return numNodes(root);
	    }
		
	    private int numNodes(BinaryNode k) {
	    	int i = 0;
    		if(k != null)
    		{
    			// go left
    			i += numNodes(k.left());
    			// go right
    			i += numNodes(k.right());
    			// use value
    			i++;
    		}
    	return i;
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
	    
	    public int numLeaves() {
	    	return numLeaves(root);
	    }
	    
	    public int numLeaves(BinaryNode k) {
	    	int i = 0;
    		if(k != null) {
    			if (k.left() == null && k.right() == null) {
    				i++;
    			}
    			// go left
    			i += numLeaves(k.left());
    			// go right
    			i += numLeaves(k.right());
    		}
    	return i;
	    }
	    
	    public int eachWidth() {
	    	return -1;
	    	// TO-DO 
	    }
	    
	    public boolean isFull() {
	    	return false;
	    	// TO-DO 
	    }
	    
	    public boolean has(String y) {
	    	if (levelOrder().contains(y)) {
	    		return true;
	    	}
	    	return false;
	    }
	    
	    public String getLargest() {
	    	return null;
	    	// TO-DO 
	    }
	    
	    public String getSmallest() {
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
    	if(parent == null) return; // if parent is null, something has gone wrong
    	if(x.getValue().compareTo(parent.getValue()) < 0) // if x is less than parent
			if(parent.left()==null) // if no left child
				parent.setLeft(x);
			else
				add(parent.left(),x);
		else // x greater
			if(parent.right()==null) // if no right child
				parent.setRight(x);
			else
				add(parent.right(),x);

    }

}
