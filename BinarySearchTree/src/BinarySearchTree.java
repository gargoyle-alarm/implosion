//@SuppressWarnings("unchecked")

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    
	private BinaryNode root;
	
    public BinarySearchTree() {
    	root = null;
    }
    
    public BinarySearchTree(BinaryNode k) {
    	root = k;
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
	    	if(root == null) {
	    		return 0;
	    	}
	    	Queue<BinaryNode> tree = new LinkedList();
	    	tree.add(root);
	    	int l = 0;
	    	while (!tree.isEmpty()) {
	    		int len = tree.size();
	    		l++;
	    		for (int i = 0; i < len; i++) {
	    			BinaryNode n = tree.remove();
	    			if(n.right() != null) { tree.add(n.right()); }
	    			if(n.left() != null) { tree.add(n.left()); }
	    		}
	    	}
	    	return l;
	    }
	    
	    public int width() {
	    	if(root == null) {
	    		return 0;
	    	}
	    	Queue<BinaryNode> tree = new LinkedList();
	    	tree.add(root);
	    	int w = 0;
	    	while (!tree.isEmpty()) {
	    		int len = tree.size();
	    		w = Math.max(len, w);
	    		for (int i = 0; i < len; i++) {
	    			BinaryNode n = tree.remove();
	    			if(n.right() != null) { tree.add(n.right()); }
	    			if(n.left() != null) { tree.add(n.left()); }
	    		}
	    	// goes through every level by first knocking out a node and then adding its children, like a queue.
	    	// each iteration, only the specific level's children gets knocked out because of the len parameter.
	    	}
	    	return w;
	    }
	    
	    public int height() {
	    	return height(root);
	    }
	    
	    public int height(BinaryNode k) {
	    	if (k == null) {
		        return -1;
		    }
		
		    int lefth = height(k.left());
		    int righth = height(k.right());
		
		    if (lefth > righth) {
		        return lefth + 1;
		    } else {
		        return righth + 1;
		    }
	    }
	    
	    public int diameter() {
	    	return diameter(root);
	    }
	    
	    public int diameter(BinaryNode k) {
	    	if (k == null) {
		        return -1;
		    }
		
		    int lefth = diameter(k.left());
		    int righth = diameter(k.right());
		    return lefth + 1 + righth;
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
	    	// recursively print out "width at level # #(width)"
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
	        return getLargest(root);   
	    }
	    
	    public String getLargest(BinaryNode k) {
	        int temp = 0;
	        if (k != null) {
	            if (temp < Integer.parseInt(k.getValue())) temp = Integer.parseInt(k.getValue());
	            getLargest(k.left());
	            getLargest(k.right());
	        }
	        return "" + temp;
	    }
	    
	    public String getSmallest() {
	        return getSmallest(root);
	    }
	    
	    public String getSmallest(BinaryNode k) {
	        int temp = 0;
	        if (k != null) {
	            if (temp > Integer.parseInt(k.getValue())) temp = Integer.parseInt(k.getValue());
	            getSmallest(k.left());
	            getSmallest(k.right());
	            
	        }
	        return "" + temp;
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
