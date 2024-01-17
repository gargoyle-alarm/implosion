//@SuppressWarnings("unchecked")
import static java.lang.System.*;
import java.util.PriorityQueue;
import java.util.Scanner;
public class BinarySearchTreeDriver {
	
	private static int num1, num2, num3;
	
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        num1 = kb.nextInt();
        BinarySearchTree bst = new BinarySearchTree();
        for(int i = 0; i < num1; i++) {
        	bst.add(new BinaryNode(kb.nextLine()));
        }
        num2 = kb.nextInt();
        PriorityQueue<Boolean> q = new PriorityQueue<Boolean>();
        for(int j = 0; j < num2; j++) {
        	q.add(bst.has(kb.nextLine()));
        }
        BinarySearchTree bst2 = bst;
        num3 = kb.nextInt();
        for(int k = 0; k < num3; k++) {
        	bst2.remove(kb.nextLine());
        }
        
        // ok output time
        out.println(bst.toString());
        out.println("PRE ORDER\n" + bst.preOrder());
        out.println("POST ORDER\n" + bst.postOrder());
        // finish below
        out.println("IN ORDER\n" + bst.preOrder());
        out.println("POST ORDER\n" + bst.postOrder());
        
    }
    
}